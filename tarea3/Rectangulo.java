
package tarea3;

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;

    public Rectangulo (double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea(){
        double resul = largo * ancho;
        return resul;
    }
    
    @Override
    public int calcularLados(){
        return 4;
    }
    
}
