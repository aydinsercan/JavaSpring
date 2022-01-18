package Uygulamalar;

import dto.ProductCommentCountDto;
import entityservice.ProductCommentCountEntityService;
import java.util.List;
//Find product comment count 
public class DtoAppProductCommentCount {
    public static void main(String[] args) {
        ProductCommentCountEntityService service = new ProductCommentCountEntityService();
        List<ProductCommentCountDto> list = service.findCommentCount();

        for (ProductCommentCountDto productCommentCountDto : list ) {
            System.out.println(productCommentCountDto);
        }
    }
}
