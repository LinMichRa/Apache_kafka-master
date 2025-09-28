package co.vinni.kafka.SBProveedor.model;

public class Order {
    private String id;
    private String product;
    private int quantity;
    private double price;
    private String customer;

    // Constructor vacío
    public Order() {}

    // Constructor completo
    public Order(String id, String product, int quantity, double price, String customer) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.customer = customer;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }
}
