package misc;

import java.util.Scanner;

public class Greeter {
    public Greeter() {
        Scanner console = new Scanner(System.in);
        while (console.hasNextLine()) {
            String line = console.nextLine();
            if (line.equals("")) {
                break;
            }
            System.out.println("Hello, " + line);
        }
    }

    public static void main(String[] args) {
        new Greeter();
    }
}
