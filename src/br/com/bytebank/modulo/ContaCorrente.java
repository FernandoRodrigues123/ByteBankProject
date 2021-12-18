package br.com.bytebank.modulo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable{
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	
	@Override
	
	public void saque(double valor) throws SaldoInsuificienteException {
		double valorASacar = valor + 0.2;
	    super.saque(valorASacar);
		
	}
	
	@Override
	public void deposita(double valor) { 
	super.saldo = super.saldo + valor;
		
	}


	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
	
		return "Conta Corrente: " + super.toString();
	}

}
