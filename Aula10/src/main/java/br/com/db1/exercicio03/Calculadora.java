package br.com.db1.exercicio03;

public class Calculadora {

	private Double resultado;
		
	public Calculadora() {
		zerarCalculo();
	}
			
	public void zerarCalculo() {	
		resultado = 0d;
	}
	
	public void somar(Double valor1, Double valor2) {		
		resultado = valor1 + valor2;
	}
	
	public void subtrair(Double valor1, Double valor2) {	
		resultado = valor1 - valor2;
	}
	
	public void dividir(Double valor1, Double valor2) {		
		resultado = valor1 / valor2;
	}
	
	public void multiplicar(Double valor1, Double valor2) {		
		resultado = valor1 * valor2;
	}
	

	public Double exibirResultado() {
		return resultado;	
	}
}
