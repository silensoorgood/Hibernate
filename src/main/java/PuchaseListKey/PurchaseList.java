package PuchaseListKey;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Purchaselist")
public class PurchaseList {
    @EmbeddedId
    private PurchaseListKey key;

    @Column(name = "Student_name", insertable = false, updatable = false)
    private String studentName;
    @Column(name = "Course_name", insertable = false, updatable = false)
    private String courseName;
    private int price;
    @Column(name = "Subscription_date")
    private Date subscriptionDate;
}
