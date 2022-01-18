package Uygulamalar;

import dto.ProductReviewDto;
import entityservice.ProductEntityService;

import java.util.List;

public class DtoApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<ProductReviewDto> list = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (ProductReviewDto productReviewDto : list ) {
            System.out.println(productReviewDto);
        }
    }
}
