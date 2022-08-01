package sec04.exam03;

public class Car {
    //field
    int gas;

    //Constructor

    //method
    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas==0){
            System.out.println("There is no gas");
            return false;
        }
        System.out.println("There is gas");
        return true;
    }

    void run(){
        while(true){
            if(gas>0){
                System.out.println("Run!.(Gas remained : " + gas + ")");
                gas -= 1;
            }else{
                System.out.println("Stop!.(Gas reamined : " + gas + ")");
                return;
            }
        }
    }
}
