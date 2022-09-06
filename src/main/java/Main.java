import Courses.Courses;
import Student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Student student = session.get(Student.class, 2);
        System.out.println("Какие курсы у ученика: ");
        for (Courses courses1 : student.getCoursesList()) {
            System.out.println(courses1.getName());

        }
        System.out.println(System.lineSeparator());

        Courses courses = session.get(Courses.class, 1);
        System.out.println("Студенты курса:");
        for (Student student1 : courses.getStudentList()) {
            System.out.println(student1.getName());
        }

        System.out.println(System.lineSeparator() + "Имя учителя курса: " + courses.getTeacher().getName());
    }
}