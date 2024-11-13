package TOYSTORE;

public class Article {
    private static int idCounter = 0;

    private double price;
    private int id;

    public Article(double price) {
        this.price = price;
        this.id = idCounter;
        this.idCounter++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId(){
        return id;
    }

    // no setId because we don't want anyone else to access/change the id.
    
}
