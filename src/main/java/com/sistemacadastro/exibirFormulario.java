package com.sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;
import com.sistemacadastro.entidade.entidadeEndereco;
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
  public entidadeEndereco endereco = new entidadeEndereco();
  public float idade;
  public float peso;
  public String raca;

  public void lista() {
    int i = 0;
    lista = lf.getList();
    while (i < 7) {
      System.out.println(lista.get(i));
      if (i == 0) {
        setNome();
        i++;
      } else if (i == 1) {
        setTipo();
        i++;
      } else if (i == 2) {
        setSexo();
        i++;
      } else if (i == 3) {
        setEndereco();
        i++;
      } else if (i == 4) {
        setIdade();
        i++;
      } else if (i == 5) {
        setPeso();
        i++;
      } else if (i == 6) {
        setRaca();
        i++;
      }
    }
  }

  public void setNome() {
    nomeCompleto = sc.nextLine();
    String[] te = nomeCompleto.split(" ");
    if (te.length < 2) {
      throw new Error("Erro o animal precisa de um sobrenome");
    } else if (nomeCompleto.matches(regex)) {
      throw new Error("Erro de caracter especial ");
    }

  }

  public void setTipo() {
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

  public void setSexo() {
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

  public void setEndereco() {
    System.out.println("i. Numero da casa");
    endereco.setNumero(sc.nextInt());
    sc.nextLine();
    System.out.println("ii. Cidade: ");
    endereco.setCidade(sc.nextLine());
    System.out.println("iii. Rua:");
    endereco.setRua(sc.nextLine());

  }

  public void setIdade() {
    String entrada = sc.next().replace(",", ".");
    idade = Float.parseFloat(entrada);
  }

  public void setPeso() {

    String entrada = sc.next().replace(",", ".");
    peso = Float.parseFloat(entrada);
  }

  public void setRaca() {
    sc.next();
    raca = sc.nextLine();
  }
}
