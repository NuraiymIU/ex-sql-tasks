package kg.easy.exsqltasks.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Printer {

    @Id
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;

    private String color;
    private String type;
    private double price;
}
