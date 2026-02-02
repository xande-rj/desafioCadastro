package com.sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class exibirFormulario {
  static public lerFormulario lF = new lerFormulario();
  static public Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    lF.leitura();
    String tes = "";
    ArrayList<String> perguntas = lF.getList();
    for (int i = 0; i < perguntas.size(); i++) {
      if (i % 2 == 0) {
        System.out.println(perguntas.get(i));
        tes = sc.nextLine();
        System.out.println(tes);
      }
    }
  }
}
