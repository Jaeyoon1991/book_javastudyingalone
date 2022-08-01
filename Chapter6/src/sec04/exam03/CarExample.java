package sec04.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState){
            System.out.println("Start!!");
            myCar.run();
        }
        if(myCar.isLeftGas()){
            System.out.println("We don't need to charge the gas");
        }else{
            System.out.println("Charge the Gas");
        }
    }
}
