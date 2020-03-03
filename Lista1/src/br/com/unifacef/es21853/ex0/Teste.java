
package br.com.unifacef.es21853.ex0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
       Car obj1 = new Car();
       Car obj2 = new Car();
       
       obj1.motor = false;
       obj1.marca = "GM";
       obj1.modelo = "Onix";
       obj1.velocidade = 0;
       obj2.motor = false;
       obj2.marca = "VW";
       obj2.modelo = "Gol";
       obj2.velocidade = 0;
       
       // liga obj1 
       obj1.ligaMotor();
       // liga ob2
       obj2.ligaMotor();
       
       // acelerar
       
       obj1.acelera(80);
       obj2.acelera(120);
       
        JOptionPane.showMessageDialog(null, obj1.modelo + "  " + obj1.marca + "  " + obj1.velocidade);
        JOptionPane.showMessageDialog(null, obj2.modelo + "  " + obj2.marca + "  " + obj2.velocidade);
       
    }
    
}
