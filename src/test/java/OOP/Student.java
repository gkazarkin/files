package OOP;

public class Student extends Person {
    int course;

    public Student (int height, int weight, int course) {
        super (height, weight);
        this.course = course;
    }
}
