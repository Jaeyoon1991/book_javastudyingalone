package sec04.exam01;

public class Calculator {
    
    void powerOn(){
        System.out.println("Turn on the Power");
    }

    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double divide(int x, int y ){
        double result = (double) x / (double)y;
        return result;
    }

    void powerOff(){
        System.out.println("Turn off the power");

    }
}
