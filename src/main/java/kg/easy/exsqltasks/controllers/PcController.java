package kg.easy.exsqltasks.controllers;

import kg.easy.exsqltasks.models.PC;
import kg.easy.exsqltasks.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pc")
public class PcController {

    @Autowired
    private PcService pcService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<PC> findAll() {
        return pcService.findAll();
    }
}
