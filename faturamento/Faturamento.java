package faturamento;

public class Faturamento {
  protected int mesFaturamento;
  private Float valorFaturamento;
  private String observacao;

  public Faturamento(int mesFaturamento) {

    this.mesFaturamento = mesFaturamento;

  }
  public Faturamento(int mesFaturamento, Float valorFaturamento){
    this(mesFaturamento);
    this.valorFaturamento = valorFaturamento;
  }
}
