import entity.Kategory;
import entityservice.KategoryEntityService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        KategoryEntityService service = new KategoryEntityService();
        List<Kategory> kategoryList = service.findAll();

        for (Kategory i : kategoryList) {
            System.out.println(i);
        }
    }
}
