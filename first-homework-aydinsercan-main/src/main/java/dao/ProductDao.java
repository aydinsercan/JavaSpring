package dao;

import base.BaseDao;
import dto.ProductReviewDto;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll(){
        String sql = "Select product from Product product";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        return query.list();
    }
    public Product findByID(Long id){
        String sql = "Select product from Product product where product.id =: givenid";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        query.setParameter("givenid",id);

        return (Product) query.uniqueResult();
    }
    public List<Product> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatge, BigDecimal fiyatle){
        String sql = "Select product from Product product where 1=1";

        if( fiyatge != null){
            sql = sql + " and urun.fiyat >= :fiyatge";
        }
        if( fiyatge != null){
            sql = sql + " and urun.fiyat <= :fiyatle";
        }
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);

        query.setParameter("fiyatge",fiyatge);
        query.setParameter("fiyatle",fiyatle);

        return query.list();
    }
    public List<Product> findAllUrunListByFiyatBetween(BigDecimal fiyatge, BigDecimal fiyatle){
        String sql = "Select product from Product product where 1=1";
        if(fiyatge !=null && fiyatle !=null ){
            sql += " and product.fiyat between :fiyatge and :fiyatle";
        }
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);

        query.setParameter("fiyatge",fiyatge);
        query.setParameter("fiyatle",fiyatle);

        return query.list();
    }
    public List<Product> findAllUrunByKategoriKirilim(Long kirilim){
        String sql = "Select product from Product product " + " left join Kategory kategory on product.kategory.id = kategory.id "+
                " where kategory.kirilim =: kirilim";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }
    public List<ProductReviewDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim){
        String sql = "Select new dto.ProductReviewDto(product.adi, kategory.adi, product.fiyat ) from Product product "
                + " left join Kategory kategory on product.kategory.id = kategory.id "+
                " where kategory.kirilim =: kirilim";

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }




}
