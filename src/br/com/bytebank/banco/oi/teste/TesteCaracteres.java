package br.com.bytebank.banco.oi.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteCaracteres {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
//		String s = "hello world";
//		System.out.println(s.codePointAt(2));
//		Charset charset = Charset.defaultCharset();
//
//		byte[] bytes = s.getBytes("UTF-8");
//		System.out.println(bytes.length);
//		
//		String snovo = new String(bytes);
//		System.out.println(snovo);
//		
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
		
		
	}

}
