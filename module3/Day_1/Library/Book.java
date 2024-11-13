package module3.Library;

public class Book {
    // public String title;
    // public String author;
    // public String isbn;
    private String title;
    private String author;
    private String isbn;
    private Customer lastCustomer;

    public Book(String title, String author, String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setIsbn(isbn);
        this.lastCustomer = null;
    }    
    
   

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Customer getLastCustomer(){
        return lastCustomer;
    }

    public void setLastCustomer(Customer lastCustomer){
        this.lastCustomer = lastCustomer;
    }

    // Method to print book information
    public void print() {
        System.out.println(title + " by " + author + "\nISBN: " + isbn);
        // System.out.println(this.title + " by " + this.author + "\nISBN: " + this.isbn);
    }
}
