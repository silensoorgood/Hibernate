package Subscriptions;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Key implements Serializable {
    public Key() {

    }

    public Key(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    @Column(name = "Student_id")
    private int studentId;
    @Column(name = "Course_id")
    private int courseId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
