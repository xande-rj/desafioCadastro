package com.sistemacadastro.enums;

public enum sexoPet {
  Masculino("Masculino"),
  Feminino("Feminino");

  private String descricao;

  private sexoPet(String sexo) {
    this.descricao = sexo;
  }

  public String getSexo() {
    return this.descricao;
  }
}
