package exercicio02;

public class Principal {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		
		// Testa metodos recebendo parametros do tipo double
		//System.out.println("Soma: "+c1.somar(10.5, 10)); 
		//System.out.println("Subtração: "+c1.subtrair(20.5, 10));
		//System.out.println("Divisão: "+c1.dividir(10.8, 2));
		//System.out.println("Multiplicação: "+c1.multiplicar(10.9, 10)); 
		
		System.out.println("\n");
		
		// Testa sobrecargas com metodos recebendo parametros do tipo int
		//System.out.println("Com sobrecarga");
		//System.out.println("Soma: "+c1.somar(8, 8)); 
		//System.out.println("Subtração: "+c1.subtrair(7, 5));
		
		// Testa media passando parametro
		double[] numeros = {10,10,2} ;
		System.out.println("Media: "+c1.media(numeros));

		
		

	}

}
