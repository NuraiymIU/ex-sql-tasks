package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.mappers.PCMapper;
import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.models.dto.Task1Dto;
import kg.easy.exsqltasks.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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
    @Autowired
    private PCMapper pcMapper;

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

    @Override
    public Object executeTask(String taskNum) {
        switch (taskNum) {
            case "1":
                List<PC> pcList = pcService.findByPriceLess(500);

/*                // Первый вариант
                List<Task1Dto> task1DtoList = new ArrayList<>();
                for(PC item: pcList) {
                    Task1Dto task1Dto = new Task1Dto();
                    task1Dto.setModel(item.getProduct().getModel());
                    task1Dto.setSpeed(item.getSpeed());
                    task1Dto.setHd(item.getHd());
                    task1DtoList.add(task1Dto);
                }
                return task1DtoList;*/


/*                // Второй вариант
                return pcList.stream()
                        .map(i -> {
                            Task1Dto task1Dto = new Task1Dto();
                            task1Dto.setModel(i.getProduct().getModel());
                            task1Dto.setSpeed(i.getSpeed());
                            task1Dto.setHd(i.getHd());
                            return task1Dto;
                        })
                        .collect(Collectors.toList());*/


/*                // Третий вариант
                List<Map<String, Object>> task1DtoList = new ArrayList<>();
                for(PC item : pcList) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("model", item.getProduct().getModel());
                    map.put("speed", item.getSpeed());
                    map.put("hd", item.getHd());
                    task1DtoList.add(map);
                }*/


/*                // Четвертый вариант
                return pcService.findByPrice(500);*/

                return pcMapper.pcToTask1Dto(pcList);
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
