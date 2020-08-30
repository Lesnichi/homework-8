package src.task2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private int age;
    private double avgRating;
    private String firstName;
    private String lastName;

    public Student(int age, double avgReting, String firstName, String lastName) {
        this.age = age;
        this.avgRating = avgReting;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student getTheBestStudent(List<Student> list) {
        Student bestStudent = null;
        double temp = list.get(0).getAvgRating();
        for (Iterator<Student> iterator = list.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (student.getAvgRating() > temp) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", avgRating=" + avgRating +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
