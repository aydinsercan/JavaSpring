package base;

import hibernate.hibernateutil;
import org.hibernate.SessionFactory;

public class BaseDao {
    protected SessionFactory sessionFactory;

    public BaseDao(){
        sessionFactory = hibernateutil.getSessionFactory();
    }
}
