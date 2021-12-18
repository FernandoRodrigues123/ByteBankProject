package br.com.bytebank.banco.test.util;
import java.util.*;

import br.com.bytebank.modulo.*;

public class TesteWrapperInteger {
	public static void main(String[] args) {
	
		String ref = "1";
	int[] idades = new int[4];
	
	Integer refIdades = Integer.valueOf(100);
	int valor = refIdades.intValue();
	
   // Integer nume = Integer.valueOf(ref);
	int nume = Integer.parseInt(ref);
	System.out.println(nume);
	
	int idade = 1;
	List<Integer> num = new ArrayList<Integer>();
	num.add(idade);//Autoboxing
	
	}
}
