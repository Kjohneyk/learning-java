public class Product {
    private long id;
    private String productName;
    private String supplierName;

    public Product(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }
    
    public Product(long id, String productName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = "Nivas";
    }

    public Product() {
    }

    public void display(){
        System.out.println("Product Id is " + this.id);
        System.out.println("Product Name is " + this.productName);
        System.out.println("Supplier Name is " + this.supplierName);
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) { this.supplierName = supplierName; }
  
}
