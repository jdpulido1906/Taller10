package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.beans.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {
        public static void main(String[] args) throws SQLException {
    Repository<Product> repository = new ProductRepositoryImpl();

    System.out.println("========saveObj Insert===========");
    Product productInsert1 = new Product();
    productInsert1.setProduct_name("Pepsi");
    productInsert1.setProduct_value(10F);
    productInsert1.setCategory_id(1);
    repository.saveObj(productInsert1);

    Product productInsert2 = new Product();
    productInsert2.setProduct_name("Postobon");
    productInsert2.setProduct_value(20F);
    productInsert2.setCategory_id(1);
    repository.saveObj(productInsert2);

    System.out.println("========== listaObj =========");
    repository.listAllObj().forEach(System.out::println);
    System.out.println();

    System.out.println("========== byIdObj ===========");
    System.out.println(repository.byIdObj(1));
    System.out.println();

    System.out.println("============== saveObj ===========");
    Product productUpdate = new Product();
    productUpdate.setProduct_id(1); // Existing product ID to update
    productUpdate.setProduct_name("Updated Product");
    productUpdate.setProduct_value(50F);
    productUpdate.setCategory_id(2);
    repository.saveObj(productUpdate);
    repository.listAllObj().forEach(System.out::println);
    System.out.println();

    System.out.println("========== deleteObj ============");
    repository.deleteObj(2); // Existing product ID to delete
    repository.listAllObj().forEach(System.out::println);
}
}