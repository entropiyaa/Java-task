import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsBase {

    private List<Student> studentsList;

    public StudentsBase(List<Student> studentsList)
    {
        this.studentsList = studentsList;
    }

    public List<Student> alreadyExists(File file)
    {
        List<Student> allStudents;
        if(file.exists())
        {
            allStudents = readFile(file);
        } else {
            createFile(file);
            allStudents = readFile(file);
        }
        return allStudents;
    }

    public void createFile(File file)
    {
        createFile(file, this.studentsList);
    }

    public void createFile(File file, List<Student> studentsList)
    {
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student student : studentsList)
            {
                oos.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFile(File file)
    {
        List<Student> newStudentsList = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            while(fis.available() > 0)
            {
                newStudentsList.add((Student)ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newStudentsList;
    }
}