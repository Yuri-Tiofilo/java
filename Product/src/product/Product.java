package product;

public class Product {
    public int id;
    public String descricao;
    public int quantidade;
    public float preco;
    
    
    Product() {
        this.id = 0;
        this.descricao = "Produto não possui descrição";
        this.quantidade = 0;
        this.preco = 0.0f;
        
    }
    
    Product (int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void comprar(int x) {
        this.quantidade += x;
    }
    public void vender(int x) {
        this.quantidade -= x;
    }
    public void subir(float x) {
        this.preco += x;
    }
    public void descer(float x) {
        this.preco -= x;
    }
    
    
    @Override
    public String toString(){
        return "id:"+ this.id+
                "\n desrição:" + this.descricao + 
                "\n quantidade:" + this.quantidade +
                "\n preco:"+this.preco;
    }
}
