
package br.com.unifacef.es21853.ex0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
       Car obj1 = new Car("GM", "Onix", false, 0);//marca modelo,
       
       String marca = JOptionPane.showInputDialog("Infome a marca:");
       String modelo = JOptionPane.showInputDialog("Infome o modelo:");
       float velocidade = Float.parseFloat(JOptionPane.showInputDialog("Infome a velocidade:"));
       
       
       int aux = JOptionPane.showConfirmDialog(null, "O motor está ligado?", "Titulo", JOptionPane.YES_NO_OPTION);
       
       
       boolean motor = (aux ==  JOptionPane.YES_NO_OPTION);
       
       
       
       Car obj2 = new Car(marca, modelo, motor, velocidade);
      
       
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
       
    }
    
}
