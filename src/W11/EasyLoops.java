package W11;

public class EasyLoops {
    public EasyLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Java is weird.");
        }
    }

    public static void nestedLoopsTriangle() {
        int width = 1;
        while (width < 10) {
            int number = 1;
            while (number <= width) {
                int times = 0;
                while (times < number) {
                    System.out.print(number);
                    times++;
                }
                number++;
            }
            System.out.print("\n");
            width++;
        }
    }

    public static void bottlesOfBeer(int n) {
        if (n <= 0) {
            return;
        }

        while (n > 0) {
            String plural = n == 2 ? "" : "s";
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer. Take one down, pass it around, %d bottle%s of beer on the wall.\n", n, n, n - 1, plural);
            n--;
        }
    }


    public static void main(String[] args) {
        new EasyLoops(10);
        nestedLoopsTriangle();
        bottlesOfBeer(5);
    }
}
