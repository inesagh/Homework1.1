package agecomparison;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compareAge(Person person){
        if(age < person.age) System.out.println(person.name + " is older than me.");
        else if(age > person.age) System.out.println(person.name + " is younger than me.");
        else System.out.println(person.name + " is the same age as me.");
    }

}

