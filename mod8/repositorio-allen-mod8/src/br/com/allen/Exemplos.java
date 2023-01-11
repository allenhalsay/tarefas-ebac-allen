package br.com.allen;

/**
 * 
 * @author Allen Halsay
 *
 */
public class Exemplos {
	
	//Mais usados
	//Variável de escopo de classe
	private int codigo=1;
	private long codigoMaior=1231980;
	private boolean status=false;
	private double valorDecimal1=10.9;
	private String texto="Allen Halsay";
	
	//Menos usados
	private float valorDecimal=10.9f;
	private short shor;
	private byte bi;
	
	//Métodos
	public String retornarTexto() {
		this.codigo=0;
		return "texto";
	}
	
	//Variável de escopo de método.
	public int retornarInteiro() {
		int val = 10;
		String texto="Allen Halsay";
		return val;
	}
	public long retornarLong(long num) {
		return num;
	}
	//Construtor
	public Exemplos() {
		
	}
}
