package Uygulamalar;

import entity.Product;
import entityservice.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class FindBetweenGeAndLeApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> list = service.findAllUrunListByFiyatBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));
        for (Product product : list ) {
            System.out.println(product);
        }
    }
}
