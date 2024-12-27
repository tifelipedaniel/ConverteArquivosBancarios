package br.com.conarqban;

public class xlsCartaoItau {

	//Campos -> Data;Descricao;Valor;Cartao;Tag
	private String data, decricao, cartao, tag;
	private double valor;
	
	public String getData() {
		return data;
	}
	private void setData(String data) {
		this.data = data;
	}
	public String getDecricao() {
		return decricao;
	}
	private void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	public String getCartao() {
		return cartao;
	}
	private void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getTag() {
		return tag;
	}
	private void setTag(String tag) {
		this.tag = tag;
	}
	public double getValor() {
		return valor;
	}
	private void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
