// Clase Círculo

import Figura.*;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double pi = 3.14;
        double resul = pi * (radio * radio);
        return resul;
    }
}