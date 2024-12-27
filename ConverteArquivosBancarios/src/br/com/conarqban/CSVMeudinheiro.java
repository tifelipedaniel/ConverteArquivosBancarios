package br.com.conarqban;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVWriterBuilder;

import au.com.bytecode.opencsv.CSVWriter;

public class CSVMeudinheiro {

	private String Data;
	private String Valor;
	private String Descricao;
	private static String Conta = "";
	private static String ContaTransferencia = "";
	private static String Cartao = "";
	private static String Categoria = "";
	private static String Subcategoria = "";
	private static String Contato = "";
	private static String Centro = "";
	private static String Projeto = "";
	private static String Forma = "";
	private static String NDocumento = "";
	private static String Observacoes = "";
	private static String DataCompetencia = "";
	private static String Tags = "";
	
	
	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	private String getConta() {
		return Conta;
	}

	private void setConta(String conta) {
		Conta = conta;
	}

	private String getContaTransferencia() {
		return ContaTransferencia;
	}

	private void setContaTransferencia(String contaTransferencia) {
		ContaTransferencia = contaTransferencia;
	}

	private String getCartao() {
		return Cartao;
	}

	private void setCartao(String cartao) {
		Cartao = cartao;
	}

	private String getCategoria() {
		return Categoria;
	}

	private void setCategoria(String categoria) {
		Categoria = categoria;
	}

	private String getSubcategoria() {
		return Subcategoria;
	}

	private void setSubcategoria(String subcategoria) {
		Subcategoria = subcategoria;
	}

	private String getContato() {
		return Contato;
	}

	private void setContato(String contato) {
		Contato = contato;
	}

	private String getCentro() {
		return Centro;
	}

	private void setCentro(String centro) {
		Centro = centro;
	}

	private String getProjeto() {
		return Projeto;
	}

	private void setProjeto(String projeto) {
		Projeto = projeto;
	}

	private String getForma() {
		return Forma;
	}

	private void setForma(String forma) {
		Forma = forma;
	}

	private String getNDocumento() {
		return NDocumento;
	}

	private void setNDocumento(String nDocumento) {
		NDocumento = nDocumento;
	}

	private String getObservacoes() {
		return Observacoes;
	}

	private void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}

	private String getDataCompetencia() {
		return DataCompetencia;
	}

	private void setDataCompetencia(String dataCompetencia) {
		DataCompetencia = dataCompetencia;
	}

	private String getTags() {
		return Tags;
	}

	private void setTags(String tags) {
		Tags = tags;
	}

	public void CSVMeudinheiro() {
		
	}
	
	public void converteMeudinheiro (List<List<String>> linhas) {
		
		try {
			//csv file containing data
			FileWriter fileWriter = new FileWriter("csvMeudinheiro.csv");
			//CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
			CSVWriter csvWriter = new CSVWriter(fileWriter, ',', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END); 
			
			List<String[]> data = new ArrayList<String[]>(); 
			data.add(new String[] { "Data", "Valor", "Descrição", "Conta", "ContaTransferencia",
									"Cartao", "Categoria", "Subcategoria", "Contato", "Centro",
									"Projeto", "Forma", "NDocumento", "Observacoes",
									"DataCompetenciaTags"});
			
			linhas.forEach(cols -> {
				data.add(new String[] { cols.get(0), cols.get(2), cols.get(1) });
			}); 
		    csvWriter.writeAll(data); 
		    csvWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}	
	
}
