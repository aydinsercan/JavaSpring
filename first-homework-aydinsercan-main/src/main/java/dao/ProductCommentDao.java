package dao;

import base.BaseDao;
import dto.ProductCommentDto;
import entity.ProductComment;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {
    public List<ProductComment> findAll(){
        String sql = "select productcomment from ProductComment productcomment";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        return query.list();
    }
    public List<ProductCommentDto> findAllComment(Long id){
        String sql = "Select new dto.ProductCommentDto(product.adi, kategory.adi, product.fiyat, "
                + " user.adi, user.soyadi,user.email,user.telefon, productcomment.yorum,productcomment.yorumtarihi ) "
                + " from Product product,Kategory kategory,User user, ProductComment productcomment "
                + " where product.kategory.id = kategory.id and "
                + " product.id = productcomment.urun_id and "
                + " productcomment.user.id = user.id  and"
                + " product.id =:id";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }
}
