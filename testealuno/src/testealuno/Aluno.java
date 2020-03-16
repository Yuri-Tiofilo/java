
package testealuno;

import javax.swing.JOptionPane;



public final class Aluno {
    private int numeroAluno;
    private String nomeAluno;
    private int idadeAluno;
    private int prova1;
    private int prova2;
    private int notafinal;
    private String passou;

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }
    

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        
        this.numeroAluno = numeroAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        if(nomeAluno.length() <= 30){
           this.nomeAluno = nomeAluno;
        }
        else {
            JOptionPane.showMessageDialog(null,"Digite o nome do aluno menor que 30 caracteres");
        }
        
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        if(idadeAluno > 0){
           this.idadeAluno = idadeAluno; 
        } else {
            JOptionPane.showMessageDialog(null,"Digite uma idade valida");
        }
            
    }

    public int getProva1() {
        return prova1;
    }

    public void setProva1(int prova1) {
        if(prova1 >= 0){
           this.prova1 = prova1;
        } else {
            JOptionPane.showMessageDialog(null,"Digite uma nota valida, maior que 0");
        }
        
    }

    public int getProva2() {
        return prova2;
    }

    public void setProva2(int prova2) {
        if(prova2 >= 0){
           this.prova2 = prova2; 
        } else {
            JOptionPane.showMessageDialog(null,"Digite uma nota valida, maior que 0");
        }
    }

    public Aluno(int numeroAluno, String nomeAluno, int idadeAluno, int prova1, int prova2) {
        this.setNumeroAluno(numeroAluno);
        this.setNomeAluno(nomeAluno);
        this.setIdadeAluno(idadeAluno);
        this.setProva1(prova1);
        this.setProva2(prova2);
        
    }
    public Aluno() {
        this.numeroAluno = 123456;
        this.nomeAluno = "NOME ALUNO BB";
        this.idadeAluno = 18;
        this.prova1 = 10;
        this.prova2 = 10;
    }
    public void notaFInal() {
        int media = (getProva1() + getProva2())/2;
        setNotafinal(media);
       
        
    }
    public void passou() {
        
        if(getNotafinal() >= 7){
            this.passou = "Aluno passou";
            JOptionPane.showMessageDialog(null, this.passou);
        } else {
            this.passou = "Aluno não passou";
            JOptionPane.showMessageDialog(null, this.passou);
        }
    }
    
    public String dadosAluno() {
        return "Aluno" + "numeroAluno=" + numeroAluno + ", nomeAluno=" + nomeAluno + ", idadeAluno=" + idadeAluno + ", prova1=" + prova1 + ", prova2=" + prova2 ;
    }

    @Override
    public String toString() {
        return "Aluno" + "numeroAluno=" + numeroAluno + ", nomeAluno=" + nomeAluno + ", idadeAluno=" + idadeAluno + ", prova1=" + prova1 + ", prova2=" + prova2 + ", notafinal=" + notafinal;
    }
    
    

    
    
}
