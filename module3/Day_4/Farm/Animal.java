package module3.Day_4.Farm;

public abstract class Animal {
    public String name;
    //constructor
    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();
}


interface MilkProducer {
    void produceMilk();  // Method for producing milk
}

interface WoolProducer {
    void produceWool();  // Method for producing wool
}

class Alpaca extends Animal implements WoolProducer {

    public Alpaca() {
        super("Alpaca");
    }

    @Override
    public void makeSound() {
        System.out.println("Hum");
    }

    @Override
    public void produceWool() {
        System.out.println("Producing alpaca wool");
    }
}
class Cow extends Animal implements MilkProducer {

    public Cow() {
        super("Cow");
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void produceMilk() {
        System.out.println("Producing milk");
    }
}
class Goat extends Animal implements MilkProducer {

    public Goat() {
        super("Goat");
    }

    @Override
    public void makeSound() {
        System.out.println("Bleat");
    }

    @Override
    public void produceMilk() {
        System.out.println("Producing goat milk");
    }
}
class Sheep extends Animal implements MilkProducer, WoolProducer {

    public Sheep() {
        super("Sheep");
    }

    @Override
    public void makeSound() {
        System.out.println("Baa");
    }

    @Override
    public void produceMilk() {
        System.out.println("Producing sheep milk");
    }

    @Override
    public void produceWool() {
        System.out.println("Producing wool");
    }
}
