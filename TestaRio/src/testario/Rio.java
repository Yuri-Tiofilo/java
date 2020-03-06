package testario;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    
    public Rio() {
        this.nome = "Não possui nome";
        this.nivel = 0.0f;
        this.poluido = false;
    }
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(float nivel) {
        this.nivel += nivel;
    }
    public void ensolarar(float nivel) {
        this.nivel -= nivel;
    }
    public void limpaRio() {
        if(this.poluido) 
            this.poluido = false;
        
    }
    public void sujarRio() {
        if(!this.poluido){
            this.poluido = true;
        }
    }
    @Override
    public String toString(){
        return "id:"+ this.nome+
                "\n desrição:" + this.nivel + 
                "\n quantidade:" + this.poluido;
                
    }
}
