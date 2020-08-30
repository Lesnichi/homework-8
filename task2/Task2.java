package src.task2;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 2. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */
public class Task2 {

    public static void main(String[] args) {
        Student student0 = new Student(20, 4.5, "Ivan", "Ivanov");
        Student student1 = new Student(21, 4.6, "Petr", "Ivanovich");
        Student student2 = new Student(22, 4.9, "Vanya", "Ivanski");
        Student student3 = new Student(23, 5.0, "Roger", "Ivanovski");
        List<Student> studentListlist = new LinkedList<>();
        studentListlist.add(student0);
        studentListlist.add(student1);
        studentListlist.add(student2);
        studentListlist.add(student3);
        student0.getTheBestStudent(studentListlist).toString();
        studentListlist.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName));
        studentListlist.sort(Comparator.comparing(Student::getAge));
        studentListlist.sort(Comparator.comparing(Student::getAvgRating));
    }
}