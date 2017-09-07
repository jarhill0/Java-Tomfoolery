package L01;

public class Classroom {   //class signature
    private String teacherName;
    private int numDesks;
    private int numStudents;

    public Classroom(String name, int desks, int students) { //constructor signature
        teacherName = name;
        numDesks = desks;
        numStudents = students;
    }

    public Classroom(String name, int numDesks) {
        //code is written correctly by someone else but not shown here
    }

    public int desks() { //method signature
        return numDesks;
    }

    //returns true if the number of desks is enough for the number of students
    public boolean isEnoughDesks() {
        return (numDesks >= numStudents);
    }
}

