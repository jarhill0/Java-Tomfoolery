package L03;

public class LastLetterFinder {
    int lastLetterIndex;

    public LastLetterFinder(String word, String character) {
        // yes, word.lastIndexOf() exists...
        lastLetterIndex = -1;
        String temp = word;
        while (temp.contains(character)) {
            lastLetterIndex += temp.indexOf(character) +1;
            temp = temp.substring(temp.indexOf(character) + 1);
        }

    }
    public int getLastLetterIndex() {
        return lastLetterIndex;
    }

    public static void main(String[] args) {
        System.out.println(new LastLetterFinder("Mississippi", "i").getLastLetterIndex());
        System.out.println(new LastLetterFinder("Mississippi", "M").getLastLetterIndex());
        System.out.println(new LastLetterFinder("Mississippi", "p").getLastLetterIndex());
        System.out.println(new LastLetterFinder("Mississippi", "s").getLastLetterIndex());
        System.out.println(new LastLetterFinder("Mississippi", "x").getLastLetterIndex());
    }
}
