package PuchaseListKey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class PurchaseListKey implements Serializable {
    public PurchaseListKey() {
    }

    public PurchaseListKey(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    @Column(name = "Student_name")
    private String studentName;
    @Column(name = "Course_name")
    private String courseName;


}
