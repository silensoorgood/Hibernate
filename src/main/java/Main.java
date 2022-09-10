import Courses.Courses;
import PuchaseListKey.LinkedPurchaseList;
import PuchaseListKey.LinkedPurchaseListKey;
import PuchaseListKey.PurchaseList;
import Student.Student;
import Subscriptions.Subscriptions;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String hql = "From " + PurchaseList.class.getSimpleName();
        List<PurchaseList> purchaseLists = session.createQuery(hql).getResultList();
        Transaction transaction = session.beginTransaction();
        for (PurchaseList purchaseList : purchaseLists) {
            LinkedPurchaseList linkedPurchaseList = new LinkedPurchaseList();
            linkedPurchaseList.setCourseId(purchaseList.getCourses().getId());
            linkedPurchaseList.setStudentId(purchaseList.getStudent().getId());
            linkedPurchaseList.setKey(new LinkedPurchaseListKey(purchaseList.getStudent().getId(), purchaseList.getCourses().getId()));
            session.save(linkedPurchaseList);
        }
        transaction.commit();
        sessionFactory.close();

    }
}