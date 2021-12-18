package br.com.bytebank.test;

import br.com.bytebank.modulo.*;

public class TestErrayReferencia {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc = new ContaCorrente(11, 23);
		ContaPoupanca cp = new ContaPoupanca(999, 999);
		
		contas[1] = cp;
		contas[0] = cc;
		
		contas[0].deposita(100);
		
		ContaPoupanca cc2 = (ContaPoupanca)contas[0];//type cast

		System.out.println(cc2);
		
		System.out.println(contas[0]);
	
		System.out.println(contas[1]);
	
		
		
	}
	
	

}
