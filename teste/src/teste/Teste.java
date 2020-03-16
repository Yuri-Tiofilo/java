
package teste;
import javax.swing.JOptionPane;


public class Teste {

  
    public static void main(String[] args) {
        Cliente client1 = new Cliente("62291220", "0001", "Yuri", 15.0f);
        
        client1.realizarDeposito(451.0f);
        client1.realizarSaque(51.0f);
        
        
        String numConta = JOptionPane.showInputDialog("Informe o numero da conta");
        String numAgencia = JOptionPane.showInputDialog("Informe o numero da agencia");
        String nomeClient = JOptionPane.showInputDialog("Informe o nome do cliente");
        float saldoClient = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo do cliente"));
        
        Cliente client2 = new Cliente(numConta, numAgencia, nomeClient, saldoClient);
        
        client2.realizarDeposito(400.0f);
        client2.realizarSaque(600.0f);
        
        JOptionPane.showMessageDialog(null, client1.toString());
        JOptionPane.showMessageDialog(null, client2.toString());
        
    }
    
}
