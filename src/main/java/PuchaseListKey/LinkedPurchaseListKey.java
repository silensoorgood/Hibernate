package PuchaseListKey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public
class LinkedPurchaseListKey implements Serializable {
    public LinkedPurchaseListKey() {
    }

    public LinkedPurchaseListKey(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    @Column(name = "Student_id", insertable = false, updatable = false)
    private int studentId;
    @Column(name = "Course_id", insertable = false, updatable = false)
    private int courseId;


}
