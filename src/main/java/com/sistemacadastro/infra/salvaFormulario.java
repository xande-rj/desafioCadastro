package com.sistemacadastro.infra;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.sistemacadastro.entidade.entidadePet;

public class salvaFormulario {
  Path pasta = Paths.get("petsCadastrados");
  LocalDateTime dateTimeObj = LocalDateTime.now();
  DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");

  Path arquivo = Paths.get(pasta.getFileName() + "/" + dateTimeObj.format(myFormatter) + ".txt");

  public void formatarPet(entidadePet Pet) {

    System.out.println(Pet.toString());

    verificarPasta();
    criarArquivo();
  }

  public void salvarTxt() {

  }

  private void verificarPasta() {

    if (Files.notExists(this.pasta)) {

      try {
        Files.createDirectories(this.pasta);
        System.out.println("Pasta criada com sucesso!!");
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Pasta Localizada com sucesso!");
    }

  }

  private void criarArquivo() {
    if (Files.notExists(this.arquivo)) {
      try {
        Files.createFile(this.arquivo);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
