package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.dao.ProductRepo;
import kg.easy.exsqltasks.models.Product;
import kg.easy.exsqltasks.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        // select * from product
        return productRepo.findAll();
    }

    @Override
    public List<Product> findByType(String type) {
        return productRepo.findAllByType(type);
    }
}
