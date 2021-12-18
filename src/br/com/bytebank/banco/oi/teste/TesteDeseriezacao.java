package br.com.bytebank.banco.oi.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.bytebank.modulo.ContaCorrente;

public class TesteDeseriezacao {

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CC.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(cc.getTitular());
	}
}
