package br.com.bytebank.test;
import br.com.bytebank.modulo.*;

public class ContaTeste {
	public static void main(String[] args)  throws SaldoInsuificienteException {
		
		ContaCorrente cc =  new ContaCorrente(10, 99999);
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(10, 11111);
		cp.deposita(200);
		System.out.println("cp "+cp.getSaldo());
		
		cp.transfere(100, cc);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.saque(10);
		System.out.println(cc.getSaldo());
		
	}
}
