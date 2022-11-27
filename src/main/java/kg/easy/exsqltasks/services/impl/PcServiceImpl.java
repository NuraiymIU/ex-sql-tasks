package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.dao.PcRepo;
import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    private PcRepo pcRepo;

    @Override
    public List<PC> findAll() {
        return pcRepo.findAll();
    }

    @Override
    public List<PC> findByPriceLess(double price) {
        return pcRepo.findAllByPriceLessThan(price);
    }

    @Override
    public List<PC> findAllByPriceAndCdIn(double price, List<String> cds) {
        return pcRepo.findAllByPriceLessThanAndCdIn(price, cds);
    }
}
