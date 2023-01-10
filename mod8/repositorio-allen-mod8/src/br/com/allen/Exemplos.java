package br.com.allen;

/**
 * 
 * @author Allen Halsay
 *
 */
public class Exemplos {
	
	//Mais usados
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
	public String retornaTexto() {
		return "texto";
	}
	public int retornaInteiro() {
		return 10;
	}
	public long retornaLong(long num) {
		return num;
	}
}
