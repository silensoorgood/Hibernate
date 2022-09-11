package PuchaseListKey;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class LinkedPurchaseList {
    @EmbeddedId

    private LinkedPurchaseListKey key;
    @Column(name = "Student_id", insertable = false, updatable = false)
    private int studentId;
    @Column(name = "Course_id", insertable = false, updatable = false)
    private int courseId;
}
