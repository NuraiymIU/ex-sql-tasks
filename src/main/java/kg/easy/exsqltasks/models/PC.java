package kg.easy.exsqltasks.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class PC {

    @Id
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;

    private int speed;
    private int ram;
    private int hd;
    private String cd;
    private double price;


}
