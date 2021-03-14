package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override /* Esta anotação informa ao compilador que estamos querendo 
	reescrever, sobrescrever, redefinir o método da classe mãe */
	public void saca(double valor) throws SaldoInsuficienteException {
		double  valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	 

	@Override /* Tivemos que sobrescrecer devido o método deposita na classe
	 conta estar como abstrato */
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

//	public boolean ehIgual(Conta outra) {
//		if (super.getAgencia() != outra.getAgencia()){
//			return false;
//		}
//
//		if (super.getNumero() != outra.getNumero()) {
//			return false;
//		}
//
//		return true;
//	}

//	@Override
//	public String toString() {
//		return "ContaCorrente, Número: " + super.getNumero()
//				+ ", " + "Agência: " + super.getAgencia();
//	}
}
