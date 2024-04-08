package geometria;


class Cubo {
	
	private double longitudLado;
	
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
    	if(longitudLado > 0) {
    		this.longitudLado = longitudLado;
    	}
    	else  System.out.println("ERROR"); 
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() { 
    	return (this.longitudLado * this.longitudLado * this.longitudLado);
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLadoNueva) { 
    	if(longitudLadoNueva > 0) {
    		this.longitudLado = longitudLadoNueva;
    	}
    	else System.out.println("ERROR");
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() { 
    	return (6 * (longitudLado * longitudLado));
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
    	if(areaCara >0) {
    		
    	}
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
    
    } 

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) { }
}
