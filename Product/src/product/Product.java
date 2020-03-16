package product;

public class Product {
    private int id;
    private String descricao;
    private int quantidade;
    private float preco;
    
    
    public Product() {
        this.id = 0;
        this.descricao = "Produto não possui descrição";
        this.quantidade = 0;
        this.preco = 0.0f;
        
    }
    
    public Product (int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    
    public void comprar(int x) {
        this.quantidade += x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
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
