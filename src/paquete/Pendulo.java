package paquete;

import javax.swing.JOptionPane;

public class Pendulo { //objeto

    public double o; //atributo

    public void oscilacion(double a, double l) { //este metodo es para hallar la oscilacion
        o = (2*(Math.PI))*(Math.sqrt(a/l));
    }
    
}
