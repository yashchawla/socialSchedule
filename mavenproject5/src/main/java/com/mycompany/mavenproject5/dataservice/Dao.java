/**
 *
 * @author jikar
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.mycompany.socialschedule.dataservice;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

/**
 *
 * @author jikar
 */
public class Dao implements IDao {

        private SessionFactory sessionFactory;

        public Dao() {
                sessionFactory = SmsSessionFactory.getSessionFactory();
        }

        public <T> T save(final T o) {

                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        sessionFactory.getCurrentSession().save(o);
                        session.getTransaction().commit();
                        return o;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        public void delete(final Object object) {
                sessionFactory.getCurrentSession().delete(object);
        }

        public <T> T get(final Class<T> type, final Long id) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        T obj = sessionFactory.getCurrentSession().get(type, id);
                        session.getTransaction().commit();
                        return obj;

                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        public <T> T merge(final T o) {
                return (T) sessionFactory.getCurrentSession().merge(o);
        }

        public <T> T persist(final T o) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        sessionFactory.getCurrentSession().persist(o);
                        session.getTransaction().commit();
                        return o;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }

        }

        /**
         *
         */
        public <T> T saveOrUpdate(final T o) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        Object object = sessionFactory.getCurrentSession().merge(o);
                        session.getTransaction().commit();
                        return (T) object;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        public <T> List<T> getAll(final Class<T> type) {

                final Session session = sessionFactory.getCurrentSession();

                session.beginTransaction();
                try {
                        final Criteria crit = session.createCriteria(type);
                        List<T> lt = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

                        session.getTransaction().commit();
                        return lt;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }

        }

        public <T> List<T> getByQuery(final Class<T> type, String query) {

                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        List<T> lt = session.createQuery(query).list();
                        session.getTransaction().commit();
                        return lt;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        public Object getByQuery(String query) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        Object lt = session.createQuery(query).list();
                        session.getTransaction().commit();
                        return lt;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        //with specific field;
        public <T> Object getCustomObjByQuery(Class<T> type, String query) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        Object lt = session.createQuery(query).setResultTransformer(Transformers.aliasToBean(type)).list();
                        session.getTransaction().commit();
                        return lt;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

        public Object getByQueryWithDistinctRoot(String query) {
                final Session session = sessionFactory.getCurrentSession();
                try {
                        session.beginTransaction();
                        final Criteria crit = session.createCriteria(query);
                        Object lt = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
                        session.getTransaction().commit();
                        return lt;
                } catch (Exception ex) {
                        session.getTransaction().rollback();
                        System.out.println(ex);
                        throw ex;
                }
        }

}
