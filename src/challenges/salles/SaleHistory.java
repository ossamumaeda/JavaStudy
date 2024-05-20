package challenges.salles;

public class SaleHistory{
    private int quantity;
    private Product product;
    public SaleHistory(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString(){
        return this.getProduct() + " - " + "Quantity: " + this.getQuantity() + " -> Total price: " + this.quantity * product.getValue();
    }
}
