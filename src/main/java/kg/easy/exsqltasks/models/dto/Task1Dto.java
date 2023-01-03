package kg.easy.exsqltasks.models.dto;

import lombok.Data;

@Data
public class Task1Dto {

    private String model;
    private int speed;
    private int hd;

    public Task1Dto() {
    }

    public Task1Dto(String model, int speed, int hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }
}
