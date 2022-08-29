package com.ibm.tech.service;

import com.ibm.tech.bean.PersonBean;
import com.ibm.tech.bean.PersonResponse;
import com.ibm.tech.dao.PersonDao;
import com.ibm.tech.entity.PersonEntity;
import com.ibm.tech.exceptions.UserNotFoundException;
import com.ibm.tech.mapper.PersonMapper;
import com.ibm.tech.util.Utils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 *<b>Class</b>: TechService.<br/>
 *
 *@autor Anderson Estela Coronel <br/>
 *<u>Developed by</u>: <br/>
 *<ul>
 *<li>Anderson Estela Coronel</li>
 *</ul>
 *<ul>
 *<li>25/08/2022 Creacion de la clase</li>
 *</ul>
 * @version 1.0
 */

@Service
@AllArgsConstructor
public class TechServiceImpl implements TechService {

  private PersonDao personDao;

  private PersonMapper personMapper;

  @Override
  public List<PersonEntity> getPersons() {
    return personDao.getPersons();
  }

  @Override
  public PersonResponse getPerson(String codeEncrypt) {
    return personMapper.getPersonResponseMapper(Objects.requireNonNull(personDao
            .findById(Integer.parseInt(Utils.getDecode(codeEncrypt)))
            .orElseThrow(UserNotFoundException::new)));
  }

  @Override
  public PersonResponse updatePerson(PersonBean personBean) {

    PersonEntity personEntity = personDao.findById(Integer.parseInt(Utils
            .getDecode(personBean.getCodigoUnico()))).orElse(null);

    if(Objects.nonNull(personEntity)) {
      PersonEntity personEntity2 = personDao.save(PersonEntity.builder()
              .codigoUnico(personEntity.getCodigoUnico())
              .nombres(personBean.getNombres())
              .apellidos(personBean.getApellidos())
              .tipoDocumento(personBean.getTipoDocumento())
              .numeroDocumento(personBean.getNumeroDocumento())
              .build());

      return personMapper.getPersonResponseMapper(personEntity2);
    }

    return null;
  }
}
