package br.com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.modulo.*;

public class TestArreyList {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc= new ContaCorrente(11, 11); 
		lista.add(cc);
	
		
		ContaPoupanca cp = new ContaPoupanca(11, 32);
		lista.add(cp);
		
		boolean ex = lista.contains(cc);
		
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ex);
		System.out.println(ref.getNumero());
		
	
	}
	


}
