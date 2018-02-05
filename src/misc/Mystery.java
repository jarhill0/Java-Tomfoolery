package misc;

import java.util.ArrayList;

public class Mystery {
    public void mystery2(ArrayList<String> words) {
        int count = 2 * words.size();
        for (int index = 0; index < count; index += 2) {
            words.add(index, words.get(index));
        }
        System.out.println(words);
    }

    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<String>(3);
        w.add("She");
        w.add("loves");
        w.add("me");
        new Mystery().mystery2(w);
    }
}
