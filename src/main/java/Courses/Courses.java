package Courses;

import Student.Student;
import Teacher.Teacher;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Subscriptions", joinColumns = {@JoinColumn(name = "Course_id")},
            inverseJoinColumns = {@JoinColumn(name = "Student_id")}
    )
    private List<Student> studentList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Teacher teacher;
    private String name;
    private int duration;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM")
    private CourseType type;
    private String description;
    @Column(name = "students_count")
    private int studentsCount;
    private int price;
    @Column(name = "price_per_hour")
    private float pricePerHour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CourseType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacherId) {
        this.teacher = teacherId;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    public void setType(CourseType type) {
        this.type = type;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
