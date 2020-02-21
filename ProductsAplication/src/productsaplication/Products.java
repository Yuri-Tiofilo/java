
package productsaplication;

public class Products {
    String name;
    String category;
    String color;
    float price;
    float quant;
    float priceTotal;
    boolean state;
    boolean freeFreight;
    
    void productNew() {
        this.state = true;
    }
    void productUsed() {
       this.state = false; 
    }
    void total() {
       this.priceTotal = this.quant * this.price;
    }
    void freeFreight() {
        if(priceTotal >= 120.00) {
            this.freeFreight = true;
        }
        else {
            this.freeFreight = false;
        }
    }
}
