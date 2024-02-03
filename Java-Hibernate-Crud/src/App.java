import java.util.ArrayList;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Session session = SessionFactoryConfiguration.getInstance().getSession();

        StudentRepository studentRepository = new StudentRepository();

        StudentName studentName = new StudentName("Student 1 First Name", "Student 1 Last Name");

        ArrayList<String> mobiles = new ArrayList<>();
        mobiles.add("0776787789");
        mobiles.add("0776787739");

        StudentEntity entity = new StudentEntity();
        entity.setNic("943324149V");
        entity.setName(studentName);
        entity.setMobile(mobiles);

        Integer id = studentRepository.saveStudent(entity);
        System.out.println("Student Id : " + id);
    }
}
