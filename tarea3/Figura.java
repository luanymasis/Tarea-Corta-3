
package tarea3;


public abstract class Figura {
    
    public abstract double calcularArea();
    public abstract int calcularLados();
    public void compareTo(Figura fig1, Figura fig2){
        if (fig1.calcularArea() == fig2.calcularArea()){
            System.out.println("La figura 1 tiene: "+ fig1.calcularLados());
            System.out.println("La figura 2 tiene: "+ fig2.calcularLados());
        }
    }
}