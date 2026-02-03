package com.sistemacadastro.entidade;

import com.sistemacadastro.enums.sexoPet;
import com.sistemacadastro.enums.tipoPet;

public class entidadePet {

  private String nomePet;
  private tipoPet tipoPet;
  private sexoPet sexoPet;
  private entidadeEndereco endereco;
  private float idadePet;
  private float pesoPet;
  private String racaoPet;

  public entidadePet(String nome, tipoPet tipo, sexoPet sexo, entidadeEndereco endereco, float idade, float peso,
      String racao) {
    this.nomePet = nome;
    this.tipoPet = tipo;
    this.sexoPet = sexo;
    this.endereco = endereco;
    this.idadePet = idade;
    this.pesoPet = peso;
    this.racaoPet = racao;
  }

}
