package entityservice;

import dao.ProductCommentByUserDao;
import dto.ProductCommentByUserDto;

import java.util.List;

public class ProductCommentByUserEntityService {
    ProductCommentByUserDao productCommentByUserDao;

    public ProductCommentByUserEntityService(){
        productCommentByUserDao = new ProductCommentByUserDao();
    }

    public List<ProductCommentByUserDto> findProductCommentByUser(Long id){
        return productCommentByUserDao.findProductCommentByUser(id);
    }
}
