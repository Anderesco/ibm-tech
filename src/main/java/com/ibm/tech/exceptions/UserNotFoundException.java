package com.ibm.tech.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *<b>Class</b>: UserNotFoundException.<br/>
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

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Usuario no encontrado")
public class UserNotFoundException extends RuntimeException {

}
