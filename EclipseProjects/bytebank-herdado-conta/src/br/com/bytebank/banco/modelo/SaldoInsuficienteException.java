package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{ //Checked
	
	public SaldoInsuficienteException(String  msg) {
		super(msg);
	}

}
