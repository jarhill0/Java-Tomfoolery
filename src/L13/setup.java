package L13;

public class setup {


    public static void makeRising() {
        Sound s = new Sound(32768);
        s.setToIndex();
        s.saveAs("sounds/rising.wav");
    }


}