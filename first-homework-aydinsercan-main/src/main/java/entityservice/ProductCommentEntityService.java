package entityservice;


import dao.ProductCommentDao;
import dto.ProductCommentDto;

import java.util.List;

public class ProductCommentEntityService {
    public ProductCommentDao productCommentDao;
    public ProductCommentEntityService(){
        productCommentDao = new ProductCommentDao();
    }

    public List<ProductCommentDto> findAllComment(Long id){
        return productCommentDao.findAllComment(id);
    }

}
