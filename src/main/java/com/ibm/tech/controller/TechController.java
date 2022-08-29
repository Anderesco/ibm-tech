package com.ibm.tech.controller;

import com.ibm.tech.bean.PersonBean;
import com.ibm.tech.bean.PersonResponse;
import com.ibm.tech.entity.PersonEntity;
import com.ibm.tech.service.TechService;
import com.ibm.tech.util.Utils;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/person")
public class TechController {

  private TechService techService;

  @GetMapping("")
  public ResponseEntity<List<PersonEntity>> getPerson() {

    log.info("Get Persons");

    return ResponseEntity.ok(techService.getPersons());
  }

  @GetMapping("/search")
  public ResponseEntity<PersonResponse> getPersonByParameter(@RequestParam String codigoUnico) {
    log.info("Get person: {}", Utils.getDecode(codigoUnico));
    return ResponseEntity.ok(techService.getPerson(codigoUnico));
  }

  @PostMapping("/update")
  public ResponseEntity<Void> updatePerson(@RequestBody PersonBean personBean) throws Exception {
    log.info("Update Person...");

    if(techService.updatePerson(personBean) == null)
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    return ResponseEntity.status(HttpStatus.ACCEPTED).build();
  }
}
