package kg.easy.exsqltasks.services;

import kg.easy.exsqltasks.models.Printer;

import java.util.List;

public interface PrinterService {
    List<Printer> findAll();
}
