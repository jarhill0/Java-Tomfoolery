package L02;

public class StringSlicing {
    private String strLeft;
    private String strRight;

    public StringSlicing(String myString) {
        int spaceIndex = myString.indexOf(" ");
        if (spaceIndex == -1) {
            // No space in the string
            strLeft = myString;
            strRight = "";
            return;
        }
        strLeft = myString.substring(0, spaceIndex);
        strRight = myString.substring(spaceIndex+1);
    }

    public String getStrLeft() {
        return strLeft;
    }

    public String getStrRight() {
        return strRight;
    }

    public static void main(String[] args) {
        StringSlicing littleBaby = new StringSlicing("Little Baby");
        System.out.println(littleBaby.getStrLeft());
        System.out.println(littleBaby.getStrRight());

        StringSlicing theseThreeWords = new StringSlicing("These Three Words");
        System.out.println(theseThreeWords.getStrLeft());
        System.out.println(theseThreeWords.getStrRight());

        StringSlicing noSpaces = new StringSlicing("NoSpaces");
        System.out.println(noSpaces.getStrLeft());
        System.out.println(noSpaces.getStrRight());
    }
}
