package br.com.bytebank.banco.oi.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.io.*;

public class TesteIo {

	public static void main(String[] args) throws IOException {
		Socket sk = new Socket();
		
		InputStream file = sk.getInputStream();
		InputStreamReader red = new InputStreamReader(file,"UTF-8");
		BufferedReader bf = new BufferedReader(red);
     	
		String linha = bf.readLine();
    	

		OutputStream fos = sk.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
			
     	
     	while(linha != null && !linha.isEmpty()) {
     		bw.write(linha);
     		bw.newLine();
     		bw.flush();
     		linha = bf.readLine();
     	}
     
     	
     
     	bf.close();
		bw.close();
	}
}
