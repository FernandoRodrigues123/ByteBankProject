package br.com.bytebank.banco.oi.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.modulo.Cliente;
import br.com.bytebank.modulo.ContaCorrente;

public class SearizacaoCC {

	public static void main(String[] args) throws IOException{
		
		Cliente cl = new Cliente();
		cl.setNome("Julio");
		cl.setProfissao("Matematico");
		cl.setCpf("1234567889");
		
		ContaCorrente cc = new ContaCorrente(11,44);
		cc.setTitular(cl);
		cc.deposita(100.90);
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cc.bin"));
	 	oss.writeObject(cc);
		oss.close();
		}
	

}
