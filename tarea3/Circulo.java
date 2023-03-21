
package tarea3;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        double pi = 3.14;
        double resul = pi * (radio * radio);
        return resul;
    }
    
    @Override
    public int calcularLados(){
        return 0;
    }
}