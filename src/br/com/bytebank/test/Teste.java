package br.com.bytebank.test;

import br.com.bytebank.modulo.*;

public class Teste {

	public static void main(String[] args) {
		 
		
	ContaCorrente fer = new ContaCorrente(1, 5);
		fer.deposita(100);
		
		CalculadorDeimposto calc = new CalculadorDeimposto();
		calc.registra(fer);
		System.out.println(calc.getTotalImposto());
		
		for(int i = 0; i < 100; i++) {
			int n = 10*i;
			int c = n*5;
			System.out.println(c);
		}
	}

}
