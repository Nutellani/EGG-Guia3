package ej6;

public class Producto {

    private String product;
    private Double price;

    public Producto() {
    }

    public Producto(String product, Double price) {
        this.product = product;
        this.price = price;
    }
    
    //////////////   GETTERS & SETTERS   //////////////

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    
}
