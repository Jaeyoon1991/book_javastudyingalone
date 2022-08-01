package sec03.exam03;

public class Car {
    //Field
    String company = "Hyndai";
    String model;
    String color;
    int maxSpeed;

    //Construnctor
    Car(){

    }

    Car(String model){
        this.model = model;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String mdoel, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
}
