package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private ProductService productService;
    @Autowired
    private PcService pcService;
    @Autowired
    private PrinterService printerService;
    @Autowired
    private LaptopService laptopService;

    @Override
    public Object execute(String taskNum) {
        switch (taskNum) {
            case "1":
                return pcService.findByPriceLess(500);
            case "2":
                return productService.findByType("Printer");
            case "3":
                return laptopService.findByPriceMoreThan(1000);
            case "5":
                return pcService.findAllByPriceAndCdIn(600, Arrays.asList("12x", "24x"));
        }
        return null;
    }
}
