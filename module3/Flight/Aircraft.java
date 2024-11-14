package module3.Flight;

public abstract class Aircraft {
    public String model;
    public int  capacity;

    public Aircraft(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}

class Boeing737 extends Aircraft{
    public Boeing737(){
        super("Boeing737", 737);
    }
}
class Airbus320 extends Aircraft{
    public Airbus320(){
        super("Airbus320", 320);
    }
}
class Airbus380 extends Aircraft{
    public Airbus380(){
        super("Airbus380", 380);
    }
}


