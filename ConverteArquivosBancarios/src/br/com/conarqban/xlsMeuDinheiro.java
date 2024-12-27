package br.com.conarqban;

public class xlsMeuDinheiro {

	//Campos -> Data(B);Valor(C);Descrição(D);Conta(E);Cartão(G);Tags(Q)
	private String data, descricao, conta, cartao, tags;
	private double valor;
	
	private void setData(String data) {
		this.data = data;
	}
	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	private void setConta(String conta) {
		this.conta = conta;
	}
	private void setCartao(String cartao) {
		this.cartao = cartao;
	}
	private void setTags(String tags) {
		this.tags = tags;
	}
	private void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getConta() {
		return conta;
	}
	public String getCartao() {
		return cartao;
	}
	public String getTags() {
		return tags;
	}
	public double getValor() {
		return valor;
	}
	
	
	
	
}
