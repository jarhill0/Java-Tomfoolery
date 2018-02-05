package misc;

public class cr7 {
}


class Plant {
    private int age;
    private String name;
    private double height;

    public Plant(String name) {
        age = 0;
        this.name = name;
        height = 0;
    }

    public String type() {
        return "I am a plant";
    }

    public void increaseAge(int years) {
        age += years;
    }
}

class Tomato extends Plant {
    private int numFruits;

    public Tomato(String name, int numFruits) {
        super(name);
        this.numFruits = numFruits;
    }

    @Override
    public String type() {
        return "I am a tomato";
    }

    public void timelapse() {
        increaseAge(10);
    }
}

