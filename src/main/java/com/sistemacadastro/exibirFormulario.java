package com.sistemacadastro;

import java.util.ArrayList;
import java.util.Scanner;
import com.sistemacadastro.entidade.entidadeEndereco;
import com.sistemacadastro.entidade.entidadePet;
import com.sistemacadastro.enums.sexoPet;
import com.sistemacadastro.enums.tipoPet;
import com.sistemacadastro.infra.lerFormulario;
import com.sistemacadastro.infra.salvaFormulario;

public class exibirFormulario {
  private ArrayList<String> lista;
  static lerFormulario lf = new lerFormulario();
  private Scanner sc = new Scanner(System.in);
  private String regex = ".*[!@#$%^&*(),.?\":{}|<>].*";

  public String nomeCompleto;
  public tipoPet tipo;
  public sexoPet sexo;
  public float idade;
  public float peso;
  public String raca;

  public entidadePet Pet;
  public entidadeEndereco endereco = new entidadeEndereco();

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

    Pet = new entidadePet(nomeCompleto, tipo, sexo, endereco, idade, peso, raca);
    salvar(Pet);
  }

  public void setNome() {
    nomeCompleto = sc.nextLine();
    if (nomeCompleto.isEmpty()) {
      nomeCompleto = "";
    } else {
      String[] te = nomeCompleto.split(" ");
      if (te.length < 2) {
        throw new Error("Erro o animal precisa de um sobrenome");
      } else if (nomeCompleto.matches(regex)) {
        throw new Error("Erro de caracter especial ");
      }
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
    sc.nextLine();
    System.out.println("i. Numero da casa");

    String numeroEnderecoString = sc.nextLine();
    if (numeroEnderecoString.isEmpty()) {
      endereco.setNumero(0);
    } else {

      endereco.setNumero(Integer.parseInt(numeroEnderecoString));
    }
    System.out.println("ii. Cidade: ");
    endereco.setCidade(sc.nextLine());
    System.out.println("iii. Rua:");
    endereco.setRua(sc.nextLine());

  }

  public void setIdade() {
    String entrada = sc.nextLine().replace(",", ".");
    if (entrada.isEmpty()) {
      entrada = "0";
    }
    idade = Float.parseFloat(entrada);

    if (idade > 20) {
      throw new Error("idade precisa ser menor que 20");
    }
  }

  public void setPeso() {

    String entrada = sc.nextLine().replace(",", ".");

    if (entrada.isEmpty()) {
      entrada = "0";
    } else {

      peso = Float.parseFloat(entrada);

      if (peso > 60 || peso < 0.5) {
        throw new Error("Peso precisa ser maior que 0.5 ou menor que 60kg");
      }
    }
    peso = Float.parseFloat(entrada);

  }

  public void setRaca() {
    raca = sc.nextLine();
    if (raca.isEmpty()) {
      raca = "";
    } else {
      if (raca.matches(regex)) {
        throw new Error("raca nao pode conter caracter especial");
      }
    }
  }

  private void salvar(entidadePet Pet) {
    salvaFormulario salvaFormulario = new salvaFormulario();

    salvaFormulario.formatarPet(Pet);
  }
}
