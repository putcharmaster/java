package TOYSTORE;

public class Book extends Article{
    private String title;
    private String author;



    public Book(int pricem String title, String author){
        super(price);
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}