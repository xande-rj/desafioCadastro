package com.sistemacadastro.entidade;

public class entidadeEndereco {

  private int numeroCasa;
  private String cidade;
  private String rua;

  public void setNumero(int numb) {
    this.numeroCasa = numb;
  }

  public void setCidade(String cid) {
    this.cidade = cid;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  @Override
  public String toString() {
    return "Rua " + numeroCasa + ", " + cidade + ", " + rua;
  }
}
