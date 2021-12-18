package br.com.bytebank.banco.oi.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.modulo.Cliente;

public class SerializacaoTeste {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Cliente cl = new Cliente();
		cl.setNome("Julio");
		cl.setProfissao("Matematico");
		cl.setCpf("1234567889");
		
//		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("obj.bin"));
//     	oss.writeObject(cl);
//		oss.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.bin"));
		Cliente cl1 = (Cliente) ois.readObject();
		System.out.println(cl1.getNome());
		ois.close();
	}

}
