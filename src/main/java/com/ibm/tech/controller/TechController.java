package com.ibm.tech.controller;

import com.ibm.tech.bean.PersonResponse;
import com.ibm.tech.dao.PersonDao;
import com.ibm.tech.entity.PersonEntity;
import com.ibm.tech.util.Utils;
import java.util.List;
import java.util.Objects;
import com.ibm.tech.exceptions.UserNotFoundException;
import com.ibm.tech.mapper.PersonMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *<b>Class</b>: PersonEntity.<br/>
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

@RestController
@AllArgsConstructor
@Slf4j
public class TechController {

  private PersonDao personDao;

  private PersonMapper personMapper;

  @GetMapping("/person")
  public ResponseEntity<List<PersonEntity>> getPerson() {

    log.info("Get Persons");

    return ResponseEntity.ok(personDao.getPersons());
  }

  @GetMapping("/person/search")
  public ResponseEntity<PersonResponse> getPersonByParameter(@RequestParam String codigoUnico) {
    log.info("Get person: {}", Utils.getDecode(codigoUnico));
    return ResponseEntity.ok(personMapper.getPersonResponseMapper(Objects.requireNonNull(personDao
            .findById(Integer.parseInt(Utils.getDecode(codigoUnico)))
            .orElseThrow(UserNotFoundException::new))));
  }
}
