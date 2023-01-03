package kg.easy.exsqltasks.dao;

import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.models.dto.Task1Dto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<PC, Integer> {
    List<PC> findAllByPriceLessThan(double price);

    @Query("select new kg.easy.exsqltasks.models.dto.Task1Dto(u.product.model, u.speed, u.hd) from PC u where u.price < ?1")
    List<Task1Dto> findByPrice(double price);
    List<PC> findAllByPriceLessThanAndCdIn(double price, List<String> cds);
}
