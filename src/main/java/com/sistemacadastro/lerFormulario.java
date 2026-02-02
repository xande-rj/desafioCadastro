package com.sistemacadastro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class lerFormulario {
  public ArrayList<String> list = new ArrayList<String>();

  public void leitura() {
    File f = new File("formulario.txt");
    try (FileReader fr = new FileReader(f)) {
      BufferedReader br = new BufferedReader(fr);
      String linha;
      while ((linha = br.readLine()) != null) {
        list.add(linha);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<String> getList() {
    return list;
  }

}
