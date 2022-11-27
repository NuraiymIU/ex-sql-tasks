package kg.easy.exsqltasks.services;

import kg.easy.exsqltasks.models.Laptop;

import java.util.List;

public interface LaptopService {
    List<Laptop> findAll();

    List<Laptop> findByPriceMoreThan(double price);
}
