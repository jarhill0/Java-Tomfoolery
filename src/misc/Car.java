package misc;


public class Car {
    public void horn() {
        System.out.println("Honk");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new SportsCar();

        SportsCar c5 = new SoupedSportsCar();
        Car c4 = c5;

        c5.goNuts(); // just fine
        // c4.goNuts(); // compiling error
        ((SportsCar) c4).goNuts(); // casting works
    }
}

class SportsCar extends Car {
    public void horn() {
        System.out.println("Rev");
    }

    public void goNuts() {
        System.out.println("Screech");
    }
}

class SoupedSportsCar extends SportsCar {
    public void goNuts() {
        System.out.println("Sizze or whatever");
    }
}