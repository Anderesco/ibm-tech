package com.ibm.tech.mapper;

import com.ibm.tech.bean.PersonResponse;
import com.ibm.tech.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
  public PersonResponse getPersonResponseMapper(PersonEntity personEntity) {
    return PersonResponse.builder()
            .nombres(personEntity.getNombres())
            .apellidos(personEntity.getApellidos())
            .tipoDocumento(personEntity.getTipoDocumento())
            .numeroDocumento(personEntity.getNumeroDocumento())
            .build();
  }
}
