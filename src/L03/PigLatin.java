package L03;

public class PigLatin {
    public static String undoLatin(String word) {

        word = word.substring(0, word.length() - 2); // Remove last two chars, presumably "ay"
        int len = word.length();
        return 2 >= len ? word : word.substring(len - 1) + word.substring(0, len - 1);
    }

    public static void main(String[] args) {
        System.out.println(PigLatin.undoLatin("ellohay"));
        System.out.println(PigLatin.undoLatin("hiay"));
        System.out.println(PigLatin.undoLatin("Iay"));
        System.out.println(PigLatin.undoLatin("ppleaay")); // fake piglatin...
    }

}
