package br.com.bytebank.test;
import br.com.bytebank.modulo.*;
public class TestaSaque {
public static void main(String[] args) {
	Conta c = new ContaCorrente(123, 321);
	c.deposita(500);
	try {
	c.saque(2000);
	}catch(SaldoInsuificienteException ex) {
		System.out.println(ex.getMessage());
	}
	System.out.println(c.getSaldo());
}
}
