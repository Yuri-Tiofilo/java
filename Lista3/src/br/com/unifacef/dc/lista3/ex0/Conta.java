
package br.com.unifacef.dc.lista3.ex0;

public final class Conta {
    private String numero;
    private String nome;
    private float saldo;
    private String agencia;
    
    public Conta(String numero, String nome, float saldo, String agencia) {
        this.setNumero(this.numero);
        this.setNome(this.nome);
        this.setSaldo(this.saldo);
        this.setAgencia(this.agencia);
        
    }
    public Conta() {
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + ", agencia=" + agencia + '}';
    }
    
    
}
