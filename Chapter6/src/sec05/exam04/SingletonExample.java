package sec05.exam04;

public class SingletonExample {
    public static void main(String[] args) {
        /*  Error---not visalbe
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = new Singleton();
        */

        //static 메소드이기 떄문에 객체를 생성하지 않고 사용 가능
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체입니다.");
        }else{
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
