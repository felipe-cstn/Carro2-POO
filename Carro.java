package oo.componentes;

public class Carro {
	
	Motor motor = new Motor();
	
	void ligado() {
		motor.ligado = true;
	}
	void desligado() {
		motor.ligado = false;
	}
	void acelerar() {
		motor.injecaoEletronica += 0.4;
	}
	void frear() {
		motor.injecaoEletronica -= 0.4;
	}
	
	int giroMotor() {
		return motor.giros();
	}
	
	boolean estaLigado() {
		if(motor.ligado != true) {
			return false;
		}else
		return true;
		
	}
}
