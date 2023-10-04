package oo.componentes;

public class CarroTeste {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.ligado();
		
		System.out.println("O carro esta ligado? " + carro.estaLigado() );
		
		carro.desligado();
		
		System.out.println("O carro esta ligado? " + carro.estaLigado() );
		
		carro.ligado();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		System.out.println("Giro do motor " + carro.giroMotor() );
		carro.frear();
		carro.frear();
		carro.frear();
		
		System.out.println("Giro do motor " + carro.giroMotor() );

	}
	
	
	
}
