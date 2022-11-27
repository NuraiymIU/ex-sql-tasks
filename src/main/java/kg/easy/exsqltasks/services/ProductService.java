package kg.easy.exsqltasks.services;

import kg.easy.exsqltasks.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<Product> findByType(String type);

}
