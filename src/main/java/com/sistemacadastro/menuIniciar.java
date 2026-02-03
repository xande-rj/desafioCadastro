package com.sistemacadastro;

import java.util.Scanner;

public class menuIniciar {

  public static Scanner sc = new Scanner(System.in);
  public static String texto = " 1. Cadastrar um novo pet\n 2. Alterar os dados do pet cadastrado\n 3. Deletar um pet cadastrado\n 4. Listar todos os pets cadastrados\n 5. Listar pets por algum critério (idade, nome, raça)\n 6. Sair";

  public static void main(String[] args) {

    opcaoes();

  }

  public static void menu(int numb) {
    switch (numb) {
      case 1:

        break;
      case 2:

        break;
      case 3:

        break;
      case 4:

        break;
      case 5:

        break;
      case 6:

        break;
      default:
        opcaoes();
        break;
    }
  }

  public static void opcaoes() {
    System.out.println(texto);
    if (sc.hasNextInt()) {
      menu(sc.nextInt());
    } else {
      sc.next();
      System.out.println("Digito invalido escolha um dos numeros!");
      menu(0);
    }

  }

}
