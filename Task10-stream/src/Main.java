import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Student> listOfStudents = Stream.generate(Student::new).limit(100).collect(Collectors.toList());
        StudentsBase studentsBase = new StudentsBase(listOfStudents);

        // Создаём и читаем файл со всеми студентами, если он уже создан - просто читаем
        List<Student> studentsList = studentsBase.alreadyExists(new File("students.bin"));
        print(studentsList);

        // Сортируем студентов по возрастанию оценок
        studentsList = studentsList.stream().sorted(Comparator.comparing(Student::getMark)).collect(Collectors.toList());
        print(studentsList);

        // Создаём файл и сохраняем туда студентов, у которых оценка ниже 7
        studentsList = studentsList.stream().filter(student -> student.getMark() < 7).collect(Collectors.toList());
        File filterStudentsFile = new File("filterStudents.bin");
        studentsBase.createFile(filterStudentsFile, studentsList);
        List<Student> filterStudentsList = studentsBase.readFile(filterStudentsFile);
        print(filterStudentsList);

        // Убираем из списка трёх рандомных студентов, сохраняем в файл
        filterStudentsList = filterStudentsList.stream().limit(filterStudentsList.size() - 3).collect(Collectors.toList());
        studentsBase.createFile(filterStudentsFile, filterStudentsList);
        print(filterStudentsList);
    }

    private static void print(List<Student> list)
    {
        for(Student student : list)
        {
            System.out.println(student);
        }
        System.out.println("Количество студентов = " + list.size() + "\n");
    }
}