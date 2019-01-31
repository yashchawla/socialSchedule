 
package   com.mycompany.socialschedule.dataservice;
 
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author jikar
 */
public class SmsSessionFactory {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory configureSessionFactory() throws HibernateException {
        Configuration cfg = new Configuration();
    //    cfg.addAnnotatedClass(User.class);
        sessionFactory = cfg
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {

        sessionFactory.openSession();
        return sessionFactory;
    }

}
