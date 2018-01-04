package misc;

public class Asterisk {

    public static void main(String[] args) {
        int lines = 4;
        int x = 0;
        while (x < lines) {
            int y = x;
            while (y < lines) {
                System.out.print("*");
                y++;
            }
            System.out.println("");
            x++;
        }
    }
}
