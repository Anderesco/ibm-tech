package com.ibm.tech.service;

import com.ibm.tech.bean.PersonBean;
import com.ibm.tech.bean.PersonResponse;
import com.ibm.tech.entity.PersonEntity;
import java.util.List;

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
public interface TechService {
  List<PersonEntity> getPersons();
  PersonResponse getPerson(String codeEncrypt);
  PersonResponse updatePerson(PersonBean personBean);
}
