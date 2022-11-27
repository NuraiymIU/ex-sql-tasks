package kg.easy.exsqltasks.dao;

import kg.easy.exsqltasks.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
    List<Laptop> findAllByPriceGreaterThan(double price);
}
