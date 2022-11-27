package kg.easy.exsqltasks.dao;

import kg.easy.exsqltasks.models.PC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<PC, Integer> {
    List<PC> findAllByPriceLessThan(double price);
    List<PC> findAllByPriceLessThanAndCdIn(double price, List<String> cds);
}
