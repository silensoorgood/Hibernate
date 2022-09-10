package PuchaseListKey;

import Courses.Courses;
import Student.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Purchaselist")
@Getter
@Setter
public class PurchaseList {
    @EmbeddedId
    private PurchaseListKey key;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "student_name",referencedColumnName = "name",insertable = false,updatable = false)
    private Student student;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "course_name",referencedColumnName = "name",insertable = false,updatable = false)
    private Courses courses;
    private int price;
    @Column(name = "Subscription_date")
    private Date subscriptionDate;
}
