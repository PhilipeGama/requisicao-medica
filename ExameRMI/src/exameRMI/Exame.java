package exameRMI;

import java.io.Serializable;

public class Exame implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String resultado;
	private String valorEsperado;
	
	public Exame(String nome, String resultado, String valorEsperado) {
		this.nome = nome;
		this.resultado = resultado;
		this.valorEsperado = valorEsperado;
	}

	public String getValorEsperado() {
		return valorEsperado;
	}
	
	public void setValorEsperado(String valorEsperado) {
		this.valorEsperado = valorEsperado;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
