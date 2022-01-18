package dao;

import base.BaseDao;
import entity.Kategory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class KategoryDao extends BaseDao {

    public List<Kategory> findAll(){
        String sql = "select kategory from Kategory kategory";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        return query.list();
    }

}
