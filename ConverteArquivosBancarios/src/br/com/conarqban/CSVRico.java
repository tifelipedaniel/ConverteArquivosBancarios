package br.com.conarqban;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.*;


public class CSVRico {

	//Campos -> Data;Descricao;Valor;Saldo
	private String data, descricao, valor, saldo;
	
	public String getData() {
		return data;
	}
	private String setData(String data) {
		data = data.substring(0, 8);
		return data;
	}
	public String getDescricao() {
		return descricao;
	}
	private String setDescricao(String descricao) {
		descricao = descricao;
		return descricao;
	}
	public String getValor() {
		return valor;
	}
	private String setValor(String valor) {
		valor = valor.replaceAll("[R/$/ ]", "");
//		valor = valor + "\\\"";
//		valor = valor.replaceAll("&", "\"");
		return valor;
	}
	public String getSaldo() {
		return saldo;
	}
	private void setSaldo(String saldo) {
		this.saldo = saldo.replaceAll("[R/$/ ]", "");
//		this.saldo = "\'" + this.saldo + "\'";
//		this.saldo = this.saldo.replaceAll("\'", "\"");
	}
	
	public List<List<String>> converteRico () {
		
		List<List<String>> linhas = new ArrayList<List<String>>();
		String[] colunas = null;
		
		try {
			//csv file containing data
			FileReader filereader = new FileReader("csvRico.csv");
			CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
			CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(csvParser).build();
			
			while ((colunas = csvReader.readNext()) != null) {
				if (colunas[0].length() < 5) {
					System.out.println("Desconsiderando cabeçalhos.");
				} else {
					colunas[0] = setData(colunas[0]);
					colunas[1] = setDescricao(colunas[1]);
					colunas[2] = setValor(colunas[2]);
					linhas.add(Arrays.asList(colunas));
				}
			}
			//linhas.removeFirst();
			
			linhas.forEach(cols -> {
				System.out.println("======================");
				System.out.println("Data: " + cols.get(0));
				System.out.println(getData());
				System.out.println("Descrição: " + cols.get(1));
				System.out.println(getDescricao());
				System.out.println("Valor: " + cols.get(2));
				System.out.println(getValor());
				System.out.println("Saldo: " + cols.get(3));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return linhas;
	}
	
}
