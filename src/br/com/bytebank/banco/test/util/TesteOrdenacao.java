package br.com.bytebank.banco.test.util;
import br.com.bytebank.modulo.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.*;

import br.com.bytebank.modulo.Conta;
import br.com.bytebank.modulo.ContaCorrente;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22,33);
		cc1.deposita(333);


		
		Conta cc2 = new ContaCorrente(22,44);
		cc2.deposita(444);
		
		Conta cc3 = new ContaCorrente(22,11);
		cc3.deposita(111);
		
		Conta cc4 = new ContaCorrente(22,22);
		cc4.deposita(222);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("-------------------");
	 
		
			
		lista.sort((c1,c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		lista.forEach((conta)->{System.out.println(conta);});
		
		
		
	}
	
	 	

}
