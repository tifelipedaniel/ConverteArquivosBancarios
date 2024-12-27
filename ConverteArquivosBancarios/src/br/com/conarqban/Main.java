package br.com.conarqban;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriterBuilder;

import au.com.bytecode.opencsv.CSVWriter;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextComponent datatextarea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CSVRico csvRico = new CSVRico();
				CSVMeudinheiro csvMeuDinheiro = new CSVMeudinheiro();
				List<List<String>> linhas = new ArrayList<List<String>>();
				
				linhas = csvRico.converteRico();
				try {
					csvMeuDinheiro.converteMeudinheiro(linhas);
				} catch (Exception ex) {
				}
				lblNewLabel.setText("Gerado com sucesso.");
				
			}

		});
		
		btnGerar.setBounds(148, 43, 89, 23);
		frame.getContentPane().add(btnGerar);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 77, 414, 23);
		frame.getContentPane().add(lblNewLabel);
	}
}
