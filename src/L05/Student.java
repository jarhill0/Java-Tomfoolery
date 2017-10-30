package L05;

public class Student {
    private String myName;
    private String myClub;

    public Student(String myName, String myClub) {
        this.myName = myName;
        this.myClub = myClub;
    }

    public String getMyName() {
        return myName;
    }

    public String getMyClub() {
        return myClub;
    }

    public boolean isSameClub(Student otherStudent) {
        return myClub.equals(otherStudent.myClub);
    }
}
