package kg.easy.exsqltasks.mappers.impl;

import kg.easy.exsqltasks.mappers.PCMapper;
import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.models.dto.Task1Dto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PCMapperImpl implements PCMapper {

    @Override
    public List<Task1Dto> pcToTask1Dto(List<PC> pcList) {
        List<Task1Dto> task1DtoList = new ArrayList<>();
        for(PC item : pcList) {
            Task1Dto task1Dto = new Task1Dto();
            task1Dto.setModel(item.getProduct().getModel());
            task1Dto.setSpeed(item.getSpeed());
            task1Dto.setHd(item.getHd());
            task1DtoList.add(task1Dto);
        }
        return task1DtoList;
    }

}
