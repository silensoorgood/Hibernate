import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PurchalistHelper {
    private final SessionFactory sessionFactory;
    public PurchalistHelper() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }


    public List<Purchaselist> getPurchalist(){
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Purchaselist.class);
        Root<Purchaselist> root = cq.from(Purchaselist.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List<Purchaselist>purchaselists = query.getResultList();
        session.close();
        return purchaselists;
    }
}
