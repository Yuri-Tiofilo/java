
package productsaplication;

public class ProductsAplication {

    
    public static void main(String[] args) {
        Products p1 = new Products();
        p1.category = "Shoes";
        p1.color = "Red";
        p1.price = 120.00f;
        p1.quant = 2f;
        p1.productNew();
        p1.total();
        p1.freeFreight();
    }
    
}
