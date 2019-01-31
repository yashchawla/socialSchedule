/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.mycompany.socialschedule.dataservice;

import java.util.List;

/**
 *
 * @author jikar
 */
public interface IDao {

        public <T> T save(final T o);

        public <T> Object getCustomObjByQuery(Class<T> type, String query);

        public void delete(final Object object);

        public <T> T get(final Class<T> type, final Long id);

        public <T> T merge(final T o);

        public <T> T persist(final T o);

        public <T> T saveOrUpdate(final T o);

        public <T> List<T> getAll(final Class<T> type);

        public <T> List<T> getByQuery(final Class<T> type, String query);

        public Object getByQuery(String query);

        public Object getByQueryWithDistinctRoot(String query);

}
