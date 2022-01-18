package Uygulamalar;

import entity.Product;
import entityservice.ProductEntityService;

import java.util.List;

public class JoinApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> list = service.findAllUrunByKategoriKirilim(3L);
        for (Product product : list ) {
            System.out.println(product);
        }
    }
}
