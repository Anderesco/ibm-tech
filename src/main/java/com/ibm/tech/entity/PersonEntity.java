package com.ibm.tech.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "person")
@ToString
public class PersonEntity {

  @Id
  @Column(name = "uniqueCode")
  private Integer codigoUnico;

  @Column(name = "firstName")
  private String nombres;

  @Column(name = "lastName")
  private String apellidos;

  @Column(name = "documentType")
  private String tipoDocumento;

  @Column(name = "documentNumber")
  private String numeroDocumento;
}
