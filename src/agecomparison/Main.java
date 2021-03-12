package agecomparison;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Samuel", 24);
        Person p2 = new Person("Joel", 36);
        Person p3 = new Person("Lily", 24);
        p1.compareAge(p2);
        p1.compareAge(p3);
        p2.compareAge(p1);
    }
}
