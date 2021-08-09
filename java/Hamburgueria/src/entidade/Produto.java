package entidade;

import java.util.Scanner;

public class Produto {
	//atributos
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//construtor
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		
	
	}

	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if (estoque < 0) {
			this.estoque = 0;
		}
		else {
		this.estoque = estoque;
		}
	}
	
	
	//encapsulamento
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	//METODOS
	public void incluiEstoque(int quantidade) {
		this.estoque = this.estoque + quantidade;
		
	}
	
	public void retiraEstoque(int quantidade) {
		if(estoque <0) {
			this.estoque=0;
		} else {
			this.estoque = estoque;
		}

	}
	
	

	
	

}
