package exercicio02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculadora {

	public double somar(double v1, double v2) {
		double result;
		result = v1 + v2;
		return result;
	}

	public double subtrair(double v1, double v2) {
		double result;
		result = v1 - v2;
		return result;
	}

	public double multiplicar(double v1, double v2) {
		double result;
		result = v1 * v2;
		return result;
	}

	public double dividir(double v1, double v2) {
		double result;
		result = v1 / v2;
		return result;
	}

	public int somar(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}

	public int subtrair(int v1, int v2) {
		int result;
		result = v1 - v2;
		return result;
	}

	public double media(double[] valor) {
		double soma = 0;
		double result = 0;
		
		//ArrayList<Double> listaNumeros = new ArrayList<Double>();
		//listaNumeros.add(valor);
		for (double numeros : valor) {
			soma += numeros;
			result = soma / valor.length;
		}
		
		return result;
	}
}
