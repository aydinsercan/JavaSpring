package dao;

import base.BaseDao;
import dto.ProductCommentCountDto;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentCountDao extends BaseDao {

    public List<ProductCommentCountDto> findCommentCount(){
        String sql = " Select new dto.ProductCommentCountDto(product.id, product.adi, product.fiyat,"
                    + " NULLIF((select count(urunYorum) from ProductComment urunYorum where urunYorum.urun_id = product.id),0) as numberOfComments)"
                    + " from Product product ";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);

        return query.list();
    }
}

