package L05;

public class Person {
    private double height;

    public Person(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public boolean equals(Person otherPerson) {
        return height == otherPerson.getHeight();
    }
}

