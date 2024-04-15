package desafios;

/*Desafío Círculos
1. Para construir un círculo se requiere un punto, que será su centro, y un radio.
Nuestro pequeño programa nos permitirá verificar si hay o no intersección entre dos círculos.
Se te pide programar las clases Punto, Circulo,
y una prueba que te permita verificar el correcto funcionamiento del método especificado.

Ejemplo de funcionamiento:

Circulo c1 = new Circulo(new Punto(0, 0), 1);
Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
System.out.println(c1.intersectaCon(c2)); // true*/

class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public boolean intersectaCon(Circulo otroCirculo) {
        double distanciaCentros = Math.sqrt(Math.pow(this.centro.getX() - otroCirculo.getCentro().getX(), 2)
                                            + Math.pow(this.centro.getY() - otroCirculo.getCentro().getY(), 2));
        return distanciaCentros <= this.radio + otroCirculo.getRadio();
    }
}

