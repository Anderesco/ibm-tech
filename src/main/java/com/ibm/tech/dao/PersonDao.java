package com.ibm.tech.dao;

import com.ibm.tech.entity.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *<b>Class</b>: PersonDao.<br/>
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
public interface PersonDao extends CrudRepository<PersonEntity, Integer> {
  @Query(value = "select * from person", nativeQuery = true)
  List<PersonEntity> getPersons();
}
