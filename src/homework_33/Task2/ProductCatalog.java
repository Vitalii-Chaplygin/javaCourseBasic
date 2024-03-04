package homework_33.Task2;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer, String> catalog = new HashMap<>();

    public Map<Integer, String> getCatalog() {
        return catalog;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "catalog=" + catalog +
                '}';
    }

    public void addProduct(int productId, Product product) {
        if (catalog.containsKey(productId)) {
            System.out.println("Продукта с таким идентификатором уже существует в каталоге");
        } else {
            catalog.put(productId, String.valueOf(product));
        }
    }

    public void deleteProduct(int productId) {
        if (catalog.get(productId)==null){
            System.out.println("Такого продукта в каталоге нет");
        }else {
            catalog.remove(productId);
        }
    }

public String findProduct(int productId){
        String product=catalog.get(productId);
        if (product==null){
            System.out.println("Error");
        }else {
            System.out.println(product);
        }return product;


     }
}



