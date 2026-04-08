package com.stschool.ecommerce.repository;
import com.stschool.ecommerce.model.Product;
import com.stschool.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    /*
    CRUD Operations from CSV
     */


   private final List<Product> products;

   public ProductRepository () throws IOException {
       CsvParser csvParser = new CsvParser();
       products = csvParser.getProductsFromCsv();
   }

   /*
   Add Product
    */
   public Product save(Product product){
       this.products.add(product);
       return product;
   }
   /*
   Get By ID
    */
    public Optional<Product> getbyid(int id){
        return products.stream()
                .filter(product -> product.getId()==id)
                .findFirst();
    }

    /*
    get all
     */

    public List<Product> getProducts() {
        return products;
    }

      /*
      Update the product
       */
    public Product update(int id, Product product){
        products.replaceAll(product1 -> product1.getId()==id ? product : product1);
        return product;

    }
    /*
    delete the product
     */
    public boolean delete(int id){
       return products.removeIf(product -> product.getId()==id );
    }
}
