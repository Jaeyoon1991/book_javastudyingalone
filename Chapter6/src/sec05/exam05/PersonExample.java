package sec05.exam05;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // final field(nation)는 초기값이 "korea"로 이미 지정됐기 때문에 못 바꾼다.
        // p1.nation = "usa";
        // final field(ssn)은 초기값이 "123456-1234567"로 이미 지정됐기 때문에 못 바꾼다.
        // p1.ssn = "654321-7654321";

        p1.name = "홍삼원";



    }
    
}
