
import java.util.List;
import modelo.HibernateUtil;
import modelo.entidades.polizas.recibos.maestra.Certificado;
import org.hibernate.Query;
import org.hibernate.Session;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NELSON
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Session s = null;
            try {
                s = HibernateUtil.getSessionFactory().openSession();

                Query q = s.createQuery("SELECT P FROM " + Certificado.class.getName() + " as P LEFT JOIN P.asegurados LEFT JOIN P.beneficiarios WHERE P.recibo.id=?").
                        setLong(0, 1);

                List<Certificado> list=q.list();
                System.out.println(list.size());
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                s.close();
            }
    }

}
