package kg.easy.exsqltasks.mappers;

import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.models.dto.Task1Dto;

import java.util.List;

public interface PCMapper {
    List<Task1Dto> pcToTask1Dto(List<PC> pcList);
}
