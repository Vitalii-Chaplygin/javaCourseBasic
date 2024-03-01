package homework_33;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Молокло",20);
        Product product2 = new Product("Хлеб",15);
        Product product3 = new Product("Масло",12);
        Product product4 = new Product("Чай",5);
        Product product5 = new Product("Кофе",5);


      ProductCatalog catalog =new ProductCatalog();
        catalog.addProduct(1,product1);
        catalog.addProduct(2,product2);
        catalog.addProduct(3,product3);
        catalog.addProduct(4,product4);
        catalog.addProduct(4,product5);

        System.out.println(catalog);

        catalog.deleteProduct(5);
        catalog.deleteProduct(1);
        System.out.println(catalog);
        catalog.findProduct(2);
    }
}
