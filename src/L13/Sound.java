package L13;

import java.util.ArrayList;



public class Sound {

    private Viewer myViewer;
    private ArrayList<Integer> myData;
    private String fileName;


    /*
     * Constructor: this one opens a dialog box for you to pick a file to load.
     */
    public Sound() {
        myViewer = new Viewer();
        myData = myViewer.load();
    }


    /*
     * Constructor: creates an empty sound with the specific length of samples, all set 
     * to 0.  Remember, the default sample rate is 22050 samples per second.
     */
    public Sound(int soundLength) {
        myViewer = new Viewer();
        myData = myViewer.newSound(soundLength);
    }

    /*
     * Constructor: create a new sound from a given filename
     */
    public Sound(String fileName) {
        myViewer = new Viewer();
        myData = myViewer.load(fileName);
    }

    public void play() {
        myViewer.play();
    }

    public void zoomTo(int begin, int end) {
        myViewer.zoomTo(begin, end);
    }

    public void save() {
        myViewer.writeToFile(fileName);
    }


    public void saveAs(String anotherfile) {
        myViewer.writeToFile(anotherfile);
        fileName = anotherfile;
    }

    public void load(String filename) {
        myData = myViewer.load(filename);
    }

    public void refresh() {
        myViewer.refresh(true);
    }

    /*
     * Returns the sample rate of the sound.  Note, this should generally be 22050
     * for all your sounds, unless you have had problems with slow computers. 
     */
    private int getSamplingRate() {
        return (myViewer.getSamplingRate());
    }

    /*
     * Use this method to set a new ArrayList as the sound data.  This will keep the original viewer window.
     * Note: this method will call refresh automatically, so there is no need to do so again.
     */
    public void setMyData(ArrayList<Integer> newData) {
        myData = newData;
        myViewer.setData(newData);
    }


    public int size() {
        return myData.size();
    }

    // note, this throws out half the data
    public void doublePitch() {
        ArrayList<Integer> s = new ArrayList<Integer>(size() / 2);
        for (int i = 0; i < size(); i += 2) {
            int n = myData.get(i);
            s.add(i / 2, n);
        }
        setMyData(s);
    }

    public void amplify(double amt) {
        for (int i = 0; i < myData.size(); i++) {
            myData.set(i, (int) (myData.get(i) * amt));
        }
        refresh();
    }


    public void setToIndex() {
        for (int i = 0; i < 32768; i++) {
            myData.set(i, i);
        }
    }

    public void setToSingleTone(int hertz) {
        int maxAmplitude = 25000;  // how loud things can get

        double samplesPerCycle = getSamplingRate() / hertz;
        double radiansPerSample = (2 * Math.PI) / samplesPerCycle;

        double currentRadians = 0;
        int currentAmplitude;
        for (int i = 0; i < myData.size(); i++) {
            currentRadians += radiansPerSample;
            //radiansPerSample += 0.000001;
            currentAmplitude = (int) (Math.sin(currentRadians) * maxAmplitude);
            myData.set(i, currentAmplitude);
        }
        refresh();
    }

    public static void main(String[] args) {
        Sound s = new Sound("src\\L13\\sounds\\Kennedy_berliner.wav");
        s.doublePitch();
        s.amplify(1.2);
    }


}
