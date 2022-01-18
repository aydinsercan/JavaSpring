package Uygulamalar;
import dto.ProductCommentDto;
import entityservice.ProductCommentEntityService;
import java.util.List;
//Finding Product Comment List
public class DtoAppProductCommentList {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDto> list = service.findAllComment(3L);

        for (ProductCommentDto productCommentDto : list ) {
            System.out.println(productCommentDto);
        }
    }
}
