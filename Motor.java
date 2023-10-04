package oo.componentes;

public class Motor {
	
	double injecaoEletronica = 1;
	boolean ligado;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else
		return  (int) Math.round(injecaoEletronica*3000);	
	}
	
	
}
