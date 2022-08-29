package com.ibm.tech.util;

import com.ibm.tech.entity.PersonEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

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
                    .numeroDocumento("10719326141").build());
  }
}
