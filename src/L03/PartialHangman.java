package L03;


public class PartialHangman {
    private String wordToBeGuessed;
    private String userString;

    public String update(String letter) {
        int letterIndex = wordToBeGuessed.indexOf(letter);
        userString = userString.substring(0, letterIndex) + letter + userString.substring(letterIndex + 1);
        wordToBeGuessed = wordToBeGuessed.substring(0, letterIndex) + "_" + wordToBeGuessed.substring(letterIndex + 1);
        return userString;
    }

    public PartialHangman(String word) {
        wordToBeGuessed = word.toLowerCase();
        userString = new String(new char[word.length()]).replace("\0", "_");
    }

    public static void main(String[] args) {
        PartialHangman game = new PartialHangman("Elephant");
        game.update("l");
        game.update("n");
        game.update("e");
        game.update("e");
    }
}

