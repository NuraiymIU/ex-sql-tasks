package kg.easy.exsqltasks.services;

import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.models.dto.Task1Dto;

import java.util.List;

public interface PcService {
    List<PC> findAll();

    List<PC> findByPriceLess(double price);
    List<Task1Dto> findByPrice(double price);
    List<PC> findAllByPriceAndCdIn(double price, List<String> cds);
}
