package com.sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class exibirFormulario {
  ArrayList<String> lista;
  static lerFormulario lf = new lerFormulario();
  ArrayList<String> responta = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  private String regex = ".*[!@#$%^&*(),.?\":{}|<>].*";

  public String nomeCompleto;

  public void lista() {
    int i = 0;
    lista = lf.getList();
    while (i < 7) {
      System.out.println(lista.get(i));
      responta.add(sc.nextLine());

      nomeCompleto = responta.get(0);
      String[] te = nomeCompleto.split(" ");
      if (te.length < 2) {
        System.out.println("Erro o animal precisa de um sobrenome");
        break;
      }
      if (nomeCompleto.matches(regex)) {
        System.out.println("Erro de caracter especial ");
        break;
      }
      i++;
    }

  }

}
