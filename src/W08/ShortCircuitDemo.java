package W08;

public class ShortCircuitDemo {
    private static boolean mirror(boolean bool) {
        System.out.println("Mirror called.");
        return bool;
    }

    public ShortCircuitDemo() {
        if (1 > 2 && mirror(true)) {
        }
        if (2 > 1 || mirror(false)) {
        }
    }

    public static void main(String[] args) {
        new ShortCircuitDemo();
    }
}
