package br.com.unifacef.dc.lista3.ex2.corrigido;

public final class Passanger {
    private String rg;
    private String nome;
    
    public Passanger() {
        
    }

    public Passanger(String rg, String nome) {
        this.setNome(nome);
        this.setRg(rg);
        
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passanger{" + "rg=" + this.getRg() + ", nome=" + this.getNome() + '}';
    }
    
    

    
}
