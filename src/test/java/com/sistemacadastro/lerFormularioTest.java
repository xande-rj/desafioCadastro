package com.sistemacadastro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("leitura Teste")
public class lerFormularioTest {
  private lerFormulario lF = new lerFormulario();

  @Test
  @DisplayName("leitura")
  void testRetorno() {
    ArrayList<String> listT = new ArrayList<>();
    File f = new File("formulario.txt");
    try (FileReader fr = new FileReader(f)) {
      BufferedReader br = new BufferedReader(fr);
      String linha;
      while ((linha = br.readLine()) != null) {
        listT.add(linha);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    lF.leitura();
    assertEquals(listT, lF.getList());
  }

  @AfterEach
  void tearDown() {
    // liberar recursos se necessário
  }

  @BeforeAll
  static void beforeAll() {
    // inicia recursos caros (uma vez)
  }

  @AfterAll
  static void afterAll() {
    // limpa recursos caros (uma vez)
  }
}
