package br.senai.sp.jandira;

public class Laços {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int resultado, i;
		
		resultado = 0;
		for (i = 0; i <= 50; i++) {
			if (i % 2 == 0 )
				resultado += i;
		}
		
		System.out.println("A somatoria dos números dentro do intervalo de 50 é: " + resultado);
		
		

	}

}
