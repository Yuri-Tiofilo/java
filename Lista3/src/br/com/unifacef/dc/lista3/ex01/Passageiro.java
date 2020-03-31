
package br.com.unifacef.dc.lista3.ex01;

public class Passageiro {
    private String nome;
    private String cpf;
    
    public Passageiro() {
        
    }

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nome=" + this.nome + ", cpf=" + this.cpf + '}';
    }
}
