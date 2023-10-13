package Task3;

import java.util.ArrayList;
public class main {

    public static void main(String[] args) {


        ArrayList<String> passedCourses = new ArrayList<>();


        ArrayList<String> canTeach = new ArrayList<>();

        //Studerende som har bestået kurset og undervisere som kan undervise i kurset

        ArrayList<String> annePassedCourses = new ArrayList<>();
        annePassedCourses.add("Java 1.0");

        ArrayList<String> henrikCanTeach = new ArrayList<>();
        henrikCanTeach.add("Java 1.0");


        Person Student1 = new Student("Anne", annePassedCourses);
        Person Student2 = new Student("Camilla", passedCourses);
        Person Student3 = new Student("Lars", passedCourses);

        Person Teacher1 = new Teacher("Jan", canTeach);
        Person Teacher2 = new Teacher("Henrik", henrikCanTeach);
        Person Teacher3 = new Teacher("Jytte", canTeach);

        //Person arraylist add students and teachers

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(Student1);
        persons.add(Student2);
        persons.add(Student3);

        persons.add(Teacher1);
        persons.add(Teacher2);
        persons.add(Teacher3);


        for (Person person : persons) {
            person.addCourse("Java 1.0");
            if (!person.addCourse(("Java 1.0"))) {
                if (person instanceof Student) {
                    Student student = (Student) person;
                    if (!student.passedCourses.contains("Java 1.0!")) {
                        System.out.println(person.name + "har allerede bestået dette kursus");
                    }
                } else if (person instanceof Teacher) {
                    Teacher teacher=(Teacher)person;
                    if (!teacher.canTeach.contains("Java 1.0")) {
                        System.out.println(person.name + "kan ikke undervise i dette fag");

                    }

                }

            }
        }
    }
}


