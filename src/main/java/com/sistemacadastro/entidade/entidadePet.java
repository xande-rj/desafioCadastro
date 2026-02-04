package com.sistemacadastro.entidade;

import com.sistemacadastro.enums.sexoPet;
import com.sistemacadastro.enums.tipoPet;

public class entidadePet {
  private final String BRANCO = "NÃO INFORMADO";

  private String nomePet;
  private tipoPet tipoPet;
  private sexoPet sexoPet;
  private entidadeEndereco endereco;
  private String idadePet;
  private String pesoPet;
  private String racaPet;

  public entidadePet(String nome, tipoPet tipo, sexoPet sexo, entidadeEndereco endereco, float idade, float peso,
      String raca) {
    this.nomePet = nome;

    if (this.nomePet.isEmpty()) {
      this.nomePet = this.BRANCO;
    }

    this.tipoPet = tipo;
    this.sexoPet = sexo;
    this.endereco = endereco;

    this.idadePet = Float.toString(idade);
    if (this.idadePet.equals("0.0")) {
      this.idadePet = this.BRANCO;
    }
    this.pesoPet = Float.toString(peso);
    if (this.pesoPet.equals("0.0")) {
      this.pesoPet = this.BRANCO;
    }
    this.racaPet = raca;

    if (this.racaPet.isEmpty()) {
      this.racaPet = this.BRANCO;
    }
  }

  @Override
  public String toString() {
    return nomePet + tipoPet.getDescricao() + sexoPet.getSexo() + endereco.toString() + idadePet + pesoPet + racaPet;
  }

}
