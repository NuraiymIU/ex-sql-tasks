package kg.easy.exsqltasks.controllers;

import kg.easy.exsqltasks.models.Printer;
import kg.easy.exsqltasks.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/printer")
public class PrinterController {

    @Autowired
    private PrinterService printerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Printer> findAll() {
        return printerService.findAll();
    }
}
