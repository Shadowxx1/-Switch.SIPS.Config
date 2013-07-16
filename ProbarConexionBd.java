
import modelo.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
/**
 *
 * @author Nelson Moncada
 */
public class ProbarConexionBd {

    public static void main(String[] args) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        tx.commit();
        s.close();
    }
}
