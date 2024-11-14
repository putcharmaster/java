package module3.Day_4.Farm;

public class MainProgram {
    public static void main(String[] args) {
        // Create some animals
        Animal[] animals = new Animal[5];
        animals[0] = new Alpaca();
        animals[1] = new Cow();
        animals[2] = new Goat();
        animals[3] = new Goat();
        animals[4] = new Sheep();

        // All animals make a sound
        for (int i = 0; i < 5; i++) {
            System.out.print(animals[i].name + " is making the sound: ");
            animals[i].makeSound();
        }

        // All animals should produce
        for (int i = 0; i < 5; i++) {
            if (animals[i] instanceof MilkProducer) {
                ((MilkProducer) animals[i]).produceMilk();
            }
            if (animals[i] instanceof WoolProducer) {
                ((WoolProducer) animals[i]).produceWool();
            }
        }
    }
}
    
    

