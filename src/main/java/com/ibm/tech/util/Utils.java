package com.ibm.tech.util;

import com.ibm.tech.entity.PersonEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

/**
 *<b>Class</b>: Utils.<br/>
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
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {
  public static String getDecode(String code) {
    return new String(Base64.getDecoder().decode(code.getBytes()));
  }

  public static List<PersonEntity> getListPersons() {
    return Arrays.asList(PersonEntity.builder()
                    .codigoUnico(1)
                    .nombres("Anderson")
                    .apellidos("Estela Coronel")
                    .tipoDocumento("DNI")
                    .numeroDocumento("71932614").build(),
            PersonEntity.builder()
                    .codigoUnico(2)
                    .nombres("Carol")
                    .apellidos("Martinez Corzo")
                    .tipoDocumento("DNI")
                    .numeroDocumento("70057321").build(),
            PersonEntity.builder()
                    .codigoUnico(3)
                    .nombres("Anabell")
                    .apellidos("Martinez Ramirez")
                    .tipoDocumento("RUC")
                    .numeroDocumento("10719326141").build(),
            PersonEntity.builder()
                    .codigoUnico(4)
                    .nombres("Jose")
                    .apellidos("Delgado Ramos")
                    .tipoDocumento("RUC")
                    .numeroDocumento("107192365478").build(),
            PersonEntity.builder()
                    .codigoUnico(5)
                    .nombres("Luis")
                    .apellidos("Alvarado Oyarce")
                    .tipoDocumento("DNI")
                    .numeroDocumento("78965412").build(),
            PersonEntity.builder()
                    .codigoUnico(6)
                    .nombres("Giselle")
                    .apellidos("Vasquez Coronel")
                    .tipoDocumento("C.E.")
                    .numeroDocumento("1234A4763B").build(),
            PersonEntity.builder()
                    .codigoUnico(7)
                    .nombres("Cristian")
                    .apellidos("Estela Gomez")
                    .tipoDocumento("DNI")
                    .numeroDocumento("23847563").build(),
            PersonEntity.builder()
                    .codigoUnico(8)
                    .nombres("Mario")
                    .apellidos("Bullon Tirado")
                    .tipoDocumento("C.E.")
                    .numeroDocumento("4876H764").build(),
            PersonEntity.builder()
                    .codigoUnico(9)
                    .nombres("Leslie")
                    .apellidos("Minaya Morales")
                    .tipoDocumento("DNI")
                    .numeroDocumento("12365498").build(),
            PersonEntity.builder()
                    .codigoUnico(10)
                    .nombres("Alicia")
                    .apellidos("Nuñez Ochoa")
                    .tipoDocumento("C.E.")
                    .numeroDocumento("12N456H78").build());
  }
}
