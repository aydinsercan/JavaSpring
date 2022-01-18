package entityservice;

import dao.ProductDao;
import dto.ProductReviewDto;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {
    public ProductDao productDao;
    public ProductEntityService(){
        productDao = new ProductDao();
    }
    public List<Product> findAll(){
        return productDao.findAll();
    }
    public Product findById(Long id){
        return productDao.findByID(id);
    }
    public List<Product> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatge, BigDecimal fiyatle){
        return productDao.findAllUrunListByFiyatGeAndFiyatLe(fiyatge, fiyatle);
    }
    public List<Product> findAllUrunListByFiyatBetween(BigDecimal fiyatge, BigDecimal fiyatle){
        return productDao.findAllUrunListByFiyatBetween(fiyatge,fiyatle);
    }
    public List<Product> findAllUrunByKategoriKirilim(Long kirilim){
        return productDao.findAllUrunByKategoriKirilim(kirilim);
    }
    public List<ProductReviewDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim){
        return productDao.findAllUrunDetayDtoByKategoriKirilim(kirilim);
    }

}
