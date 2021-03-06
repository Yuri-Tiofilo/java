package br.com.unifacef.dc.lista3.ex0;
import javax.swing.JOptionPane;

public final class CartaoDebito {
    private String numeroCartao;
   
    private int cvv;
    private String senha;
    private String validade;
     // associação 
    private Conta conta;

    public CartaoDebito() {
        
    }
    
    public CartaoDebito(String numeroCartao, float limite, int cvv, String senha, String validade, Conta conta) {
        this.setNumeroCartao(this.numeroCartao);
        // this.setLimite(this.limite);
        this.setCvv(this.cvv);
        this.setSenha(this.senha);
        this.setValidade(this.validade);
        this.setConta(this.conta);
    }
   
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

   

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    

    @Override
    public String toString() {
        return "CartaoDebito{" + "numeroCartao=" + numeroCartao + ", cvv=" + cvv + ", senha=" + senha + ", validade=" + validade + ", conta=" + conta + '}';
    }
    public boolean compra(float valor, String senha) {
        if(senha.equals(this.senha)) {
          if(valor <= this.conta.getSaldo()) {
              this.conta.setSaldo(this.conta.getSaldo() - valor);
              return true;
          } else return false;
            
            
        } 
        else return false;
    }
    
    
    
    
}
