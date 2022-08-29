package com.ibm.tech.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class PersonResponse {
  private String nombres;

  private String apellidos;

  private String tipoDocumento;

  private String numeroDocumento;
}
