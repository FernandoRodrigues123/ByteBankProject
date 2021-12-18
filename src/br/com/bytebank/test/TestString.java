package br.com.bytebank.test;



public class TestString {
	public static void main(String[] args) {
		String c = "Fernando";
	
		
		
		
		String v = " lol ";
		String vv = v.trim();
		if(vv.isEmpty()) {
			System.out.println("sem texto");
		}else{
			System.out.println(vv);
			System.out.println(vv.contains("i"));
		}
		
		int q = c.length();
		System.out.println(q);
		for (int i = 0; i < q; i++) {
			System.out.print(c.charAt(i));
		}
		//String n = c.substring(3);
		//System.out.println(n);
		//int p = c.indexOf("an");
		//System.out.println(p);
		//char h = c.charAt(0);;
		//System.out.println(h);
		//char F = 'F';
		//char f = 'f';
		
		//String o = c.replace(F, f);
		
		//System.out.println(c);
		//System.out.println();
	}

}
