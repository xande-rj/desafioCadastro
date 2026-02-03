package com.sistemacadastro.enums;

public enum tipoPet {
  Cachorro("Cachorro"),
  Gato("Gato");

  private String descricao;

  private tipoPet(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return this.descricao;
  }
}
