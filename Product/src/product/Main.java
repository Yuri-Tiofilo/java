package product;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       Product product1 = new Product(1, "Tenis top", 20, 250.0f);
       
       int id = Integer.parseInt(JOptionPane.showInputDialog("Infome o id do produto:"));
       String descricao = JOptionPane.showInputDialog("Infome a descricao:");
       float preco = Float.parseFloat(JOptionPane.showInputDialog("Infome o preço:"));
       
       int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade:"));
       
       Product product2 = new Product(id, descricao, quantidade, preco);
        
       product2.comprar(4);
       product2.vender(2);
       product2.subir(50);
       product2.descer(22);
       
       product1.comprar(4);
       product1.vender(2);
       product1.subir(50);
       product1.descer(22);

       
       JOptionPane.showMessageDialog(null, product1.toString());
       JOptionPane.showMessageDialog(null, product2.toString());
       
      
       

    }
    
}
