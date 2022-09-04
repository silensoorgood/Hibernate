import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

@Entity
@Getter
@Setter

public class Purchaselist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;
    private int price;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "subscription_date")
    private Date subscriptionDate;

    @Override
    public String toString() {
        return " id: " + id +
                "\n courseName= " + courseName +
                "\n price= " + price +
                "\n studentName= " + studentName +
                "\n subscriptionDate= " + subscriptionDate + System.lineSeparator();

    }
}
