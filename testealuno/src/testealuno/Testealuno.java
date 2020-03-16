
package testealuno;

import javax.swing.JOptionPane;



public class Testealuno {

   
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, "Yuri", 19, 10, 10);
        aluno1.notaFInal();
        
        int codAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno"));
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));
        int prova1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova 1"));
        int prova2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova 2"));
        Aluno aluno2 = new Aluno(codAluno, nome, idade, prova1, prova2 );
        aluno2.notaFInal();
        aluno1.passou();
        aluno2.passou();
        
        JOptionPane.showMessageDialog(null, aluno1.toString());
        JOptionPane.showMessageDialog(null, aluno2.toString());
    }
    
}
