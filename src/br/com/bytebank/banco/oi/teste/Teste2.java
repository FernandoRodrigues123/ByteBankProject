package br.com.bytebank.banco.oi.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Teste2 {
	public static void main(String[] args) throws IOException {
		//OutputStream os = new FileOutputStream("texto.txt");
		//Writer w = new OutputStreamWriter(os);
		//BufferedWriter bw = new BufferedWriter(w);
		
		//FileWriter fw = new FileWriter("texto.txt");
		//fw.write("Hello ");
		//fw.write(System.lineSeparator());
		//fw.write("corno");
		
		long ini = System.currentTimeMillis();
		
		PrintStream ps = new PrintStream("texto.txt", "UTF-8");
		ps.print("lolololololololo");
		ps.println();
		
		
		
		long fim = System.currentTimeMillis();
		
		ps.println("tempo: " + (fim - ini));
		
		
		ps.close();
	}

}
