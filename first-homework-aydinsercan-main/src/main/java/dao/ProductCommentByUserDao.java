package dao;

import base.BaseDao;
import dto.ProductCommentByUserDto;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentByUserDao extends BaseDao {
    public List<ProductCommentByUserDto> findProductCommentByUser(Long id){
        String sql = "Select new dto.ProductCommentByUserDto(user.id, user.adi, product.adi, urunYorum.yorum, urunYorum.yorumtarihi)"
                    + " from User user, ProductComment urunYorum, Product product "
                    + " where user.id = urunYorum.user.id and product.id = urunYorum.urun_id and user.id =: id";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        query.setParameter("id",id);

        return query.list();
    }
}
