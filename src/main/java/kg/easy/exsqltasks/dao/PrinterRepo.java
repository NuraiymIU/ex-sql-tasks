package kg.easy.exsqltasks.dao;

import kg.easy.exsqltasks.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {
}
