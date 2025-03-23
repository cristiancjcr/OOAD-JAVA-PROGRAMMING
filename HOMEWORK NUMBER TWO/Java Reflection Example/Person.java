// Person.java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodă publică
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Getter pentru name
    public String getName() {
        return name;
    }

    // Setter pentru name
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru age
    public int getAge() {
        return age;
    }

    // Setter pentru age
    public void setAge(int age) {
        this.age = age;
    }
}
