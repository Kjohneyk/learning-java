import java.util.Iterator;
import java.util.List;

public class Book {
    private String name;
    private List<Author> authorList;
    private double price;
    private int qtyInStock = 0;


    public Book() {
    }

    public Book(String name, List<Author> authorList, double price, int qtyInStock) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, List<Author> authorList, double price) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Author> getAuthorList() { return authorList; }
    public void setAuthorList(List<Author> authorList) { this.authorList = authorList; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQtyInStock() { return qtyInStock; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }

    @Override
    public String toString() {
        String objDetails;
        Iterator<Author> itr = authorList.iterator();
        objDetails = name + " by";
        while (itr.hasNext()) {
            Author author = itr.next();
            objDetails += " " + author.getName();
        }
        objDetails += " costs R "+ String.format("%.2f", price)+" : ";
        objDetails += qtyInStock > 0 ? "Available" : "Not available";
        return objDetails;
    }

    

    
}
