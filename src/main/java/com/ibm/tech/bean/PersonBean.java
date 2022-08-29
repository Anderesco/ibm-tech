package com.ibm.tech.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *<b>Class</b>: PersonBean.<br/>
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
public class PersonBean {
  private String codigoUnico;

  private String nombres;

  private String apellidos;

  private String tipoDocumento;

  private String numeroDocumento;
}
