package testario;

import javax.swing.JOptionPane;

public class TestaRio {
    
    public static void main(String[] args) {
        Rio testeRio1 = new Rio("Tiete", 1.2f, true);
        
        
        String nome = JOptionPane.showInputDialog("Infome o nome do rio:");
        float nivel = Float.parseFloat(JOptionPane.showInputDialog("Infome o nivel do rio:"));
        
        
        int aux = JOptionPane.showConfirmDialog(null, "O rio está poluido?", "Titulo", JOptionPane.YES_NO_OPTION);
        
        boolean poluido = (aux ==  JOptionPane.YES_NO_OPTION);
        
        Rio testeRio2 = new Rio(nome, nivel, poluido);
        
        testeRio1.chover(20.0f);
        testeRio1.ensolarar(10.0f);
        testeRio1.sujarRio();
        testeRio2.chover(29.0f);
        testeRio2.ensolarar(18.0f);
        testeRio2.limpaRio();
        
        
        JOptionPane.showMessageDialog(null, testeRio1.toString());
        JOptionPane.showMessageDialog(null, testeRio2.toString());
        
    }
    
}
