package br.com.bytebank.test;
import br.com.bytebank.modulo.*;

public class TestErrayPrimitivo  {

	public static void main(String[] args) {
		
		int[] idade = new int[5];
		
		for(int i = 0; i < idade.length; i++) {
			idade[i] = i;
		}

		for(int i = 0; i < idade.length; i++) {
		System.out.println(idade[i]);
		}
	
	}
	
}
