// Clase Triángulo

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Circulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double resul = (base * altura) / 2;
        return resul;
    }
}