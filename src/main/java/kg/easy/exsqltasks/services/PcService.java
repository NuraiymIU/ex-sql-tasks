package kg.easy.exsqltasks.services;

import kg.easy.exsqltasks.models.PC;

import java.util.List;

public interface PcService {
    List<PC> findAll();

    List<PC> findByPriceLess(double price);
    List<PC> findAllByPriceAndCdIn(double price, List<String> cds);
}
