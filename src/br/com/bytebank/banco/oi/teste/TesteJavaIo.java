package br.com.bytebank.banco.oi.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import br.com.bytebank.modulo.Conta;
import br.com.bytebank.modulo.*;




public class TesteJavaIo {

	public static void main(String[] args) throws IOException {
	
		OutputStream fos = new FileOutputStream("texto.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter document = new BufferedWriter(osw);
		
		Conta cc = new ContaCorrente(11, 12);
		cc.deposita(100);
		document.write(cc.getNumero());
		
     	
     
     	
     	document.close();
	}
}
