package entityservice;

import dao.ProductCommentCountDao;
import dto.ProductCommentCountDto;
import java.util.List;

public class ProductCommentCountEntityService {
    ProductCommentCountDao productCommentCountDao;

    public ProductCommentCountEntityService(){
        productCommentCountDao = new ProductCommentCountDao();
    }

    public List<ProductCommentCountDto> findCommentCount(){
        return productCommentCountDao.findCommentCount();
    }
}
