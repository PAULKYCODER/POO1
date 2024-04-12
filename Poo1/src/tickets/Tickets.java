package tickets;


class Ticket {

	private double valorTicket = 0;
	private boolean des = false;
	private int cpro = 0;
	private double sub;
    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket(double valorInicial) { 
    	this.valorTicket = valorInicial;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
    	if(cantidad < 0 && precioUnitario < 0) {
    		throw new Error ("Valores incorrectos");
    	}
    	
    	else {
    		sub = this.valorTicket += (cantidad * precioUnitario);
    		contarProductos();
    	}
    }
    
    

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    
   
		
        
    public void aplicarDescuento(double porcentaje) { 
    	if( des != true) {
    		 this.valorTicket =  (calcularSubtotal() - porcentaje);
    		 des = true;
    	}
    	else
    		throw new Error("Ya aplico descuento");
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
    	if(cpro == 0) {
    		return this.valorTicket;
    	}
    	else {
    		return this.valorTicket + sub;
    	}
    	
   
    	
    	
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
    	return calcularSubtotal() + this.valorTicket ; 
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
    	return cpro ++;
    } 
}
    	
    	
    	

