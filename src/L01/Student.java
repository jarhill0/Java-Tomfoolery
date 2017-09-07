package L01;

public class Student {
    private String eyeColor;
    private double heightInInches;
    private boolean sexIsFemale;
    private int gradeLevel;

    // Default constructor
    public Student() {
        eyeColor = "blue";
        heightInInches = 54.6;
        sexIsFemale = true;
        gradeLevel = 9;
    }

    // Custom constructor
    public Student(String eyeColor, double heightInInches, boolean isFemale, int gradeLevel) {
        this.eyeColor = eyeColor;
        this.heightInInches = heightInInches;
        this.gradeLevel = gradeLevel;
        sexIsFemale = isFemale;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void read(String book) {
    }

    public void write() {
    }

    public void talk() {
    }

}
