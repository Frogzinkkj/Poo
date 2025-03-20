package faturamento;

public abstract class Faturamento {
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
  public int getMesFaturamento() {
    return mesFaturamento;
  }
  public void setMesFaturamento(int mesFaturamento) {
    this.mesFaturamento = mesFaturamento;
  }
  public Float getValorFaturamento() {
    return valorFaturamento;
  }
  public void setValorFaturamento(Float valorFaturamento) {
    this.valorFaturamento = valorFaturamento;
  }
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }
}
