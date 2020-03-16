
package teste;

import javax.swing.JOptionPane;

public final class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String x) {
        if (x.length() == 8) {
            this.numeroConta = x;
        } else {
            JOptionPane.showMessageDialog(null,"Digite o numero da conta correto");
        }

    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null,"Digite o nome menor que 30 caracteres"); 
        }

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo += saldo;
        } else {
            JOptionPane.showMessageDialog(null,"SALDO NEGATIVOOO"); 
            
        }

    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public Cliente() {
        this.nome = "Nome cliente";
        this.numeroAgencia = "12345";
        this.numeroConta = "12345678";
        this.saldo = 0.0f;

    }


    public void realizarDeposito(float valor) {
        this.setSaldo(this.saldo += valor);
    }

    public void realizarSaque(float valor) {
        this.setSaldo(this.saldo -= valor);
    }

    @Override
    public String toString() {
        return "Cliente" + "numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", nome=" + nome + ", saldo=" + saldo ;
    }

}
