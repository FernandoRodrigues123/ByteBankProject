package br.com.bytebank.banco.test.util;
import java.util.*;
public class TesteWrapper {
	
	public static void main(String[] args) {
	
		Integer ref = Integer.valueOf(80);//autoboxing
		System.out.println(ref.intValue());//unboxing
		
		Double ref2 = Double.valueOf(9.0);
		System.out.println(ref2.doubleValue());
		
		Number nume = Integer.valueOf(2221);
		
		List<Number> numeArray = new ArrayList<Number>();
		numeArray.add(1222);
		numeArray.add(nume);
	    System.out.println(numeArray.get(0));
	    System.out.println( numeArray.get(1));
	}

}
