package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.dao.LaptopRepo;
import kg.easy.exsqltasks.models.Laptop;
import kg.easy.exsqltasks.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;

    @Override
    public List<Laptop> findAll() {
        return laptopRepo.findAll();
    }

    @Override
    public List<Laptop> findByPriceMoreThan(double price) {
        return laptopRepo.findAllByPriceGreaterThan(price);
    }
}
