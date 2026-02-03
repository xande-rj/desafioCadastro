package com.sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;

import com.sistemacadastro.enums.sexoPet;
import com.sistemacadastro.enums.tipoPet;

public class exibirFormulario {
  private ArrayList<String> lista;
  static lerFormulario lf = new lerFormulario();
  ArrayList<String> responta = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);
  private String regex = ".*[!@#$%^&*(),.?\":{}|<>].*";

  public String nomeCompleto;
  public tipoPet tipo;
  public sexoPet sexo;

  public void lista() {
    int i = 0;
    lista = lf.getList();
    while (i < 7) {
      System.out.println(lista.get(i));
      if (i == 0) {
        nome();
        i++;
      } else if (i == 1) {
        tipo();
        i++;
      } else if (i == 2) {
        sexo();
        i++;
      } else if (i == 3) {
      }
    }
  }

  public void nome() {
    nomeCompleto = sc.nextLine();
    String[] te = nomeCompleto.split(" ");
    if (te.length < 2) {
      throw new Error("Erro o animal precisa de um sobrenome");
    } else if (nomeCompleto.matches(regex)) {
      throw new Error("Erro de caracter especial ");
    }

  }

  public void tipo() {
    System.out.println("1. Cachorro\n 2. Gato");

    switch (sc.nextInt()) {
      case 1:
        tipo = tipoPet.Cachorro;
        break;
      case 2:
        tipo = tipoPet.Gato;
        break;
      default:
        break;
    }

  }

  public void sexo() {
    System.out.println("1. Masculino\n 2. Feminino");
    switch (sc.nextInt()) {
      case 1:
        sexo = sexoPet.Masculino;
        break;
      case 2:
        sexo = sexoPet.Feminino;
        break;
      default:
        break;
    }
  }
}
