package kg.easy.exsqltasks.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    private String model;
    private String maker;
    private String type;
}
