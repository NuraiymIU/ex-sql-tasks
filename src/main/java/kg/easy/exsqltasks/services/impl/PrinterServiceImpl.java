package kg.easy.exsqltasks.services.impl;

import kg.easy.exsqltasks.dao.PrinterRepo;
import kg.easy.exsqltasks.models.Printer;
import kg.easy.exsqltasks.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {

    @Autowired
    private PrinterRepo printerRepo;

    @Override
    public List<Printer> findAll() {
        return printerRepo.findAll();
    }
}
