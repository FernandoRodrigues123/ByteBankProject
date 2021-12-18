package br.com.bytebank.test;

import br.com.bytebank.modulo.*;

public class TesteSysout {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(11,11);
		System.out.println();
	
		printlr(c);
	}
	public static void printlr(Object a) {
		System.out.println(a);
	}

}