// Clase Rectángulo

public class Rectangulo extends Figura{
    private double largo;
    private doble ancho;

    public Rectangulo (double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea(){
        double resul = largo * ancho;
        return resul;
    }
    
}