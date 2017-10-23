package L05;

public class Person {
    private double height;

    public Person(double height) {
        this.height = height;
    }

    public boolean equals(Person otherPerson) {
        return height == otherPerson.height; // we can access private vars of instances of same class!
    }
}

