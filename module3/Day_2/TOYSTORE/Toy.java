package TOYSTORE;

public class Toy extends Article{
    private String name;
    private ToyType toyType;
    private double price;

    public Toy(String name, ToyType toyType, double price){
        super(price);
        this.name = name;
        this.toyType = toyType;
    }

    public Toy(String name, String toyType, double price){
        super(price);
        this.name = name;
        this.toyType = ToyType.valueOf(toyType);
    }

    


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public ToyType getToyType() {
        return toyType;
    }
    public void setToyType(ToyType toyType) {
        this.toyType = toyType;
    }
     
    
}
