package Uygulamalar;



import dto.ProductCommentByUserDto;
import entityservice.ProductCommentByUserEntityService;

import java.util.List;
//Find product comment by spesific user 
public class DtoAppProductCommentByUser {
    public static void main(String[] args) {
        ProductCommentByUserEntityService service = new ProductCommentByUserEntityService();
        List<ProductCommentByUserDto> list = service.findProductCommentByUser(3L);

        for (ProductCommentByUserDto productCommentByUserDto : list ) {
            System.out.println(productCommentByUserDto);
        }
    }
}
