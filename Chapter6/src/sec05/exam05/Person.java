package sec05.exam05;

public class Person {
    //field
    final String nation = "Korea";
    final String ssn;
    String name;

    //constructor
    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
