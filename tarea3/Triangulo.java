
package tarea3;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        double resul = (base * altura) / 2;
        return resul;
    }
    @Override
    public int calcularLados(){
        return 3;
    }
}