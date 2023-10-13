package Task3;

import java.util.ArrayList;
public class Student extends Person {

     ArrayList<String> passedCourses;

     ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses=passedCourses;
        this.currentCourses=new ArrayList<>();

    }

    @Override
    public boolean addCourse( String course) {
        if (!passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
