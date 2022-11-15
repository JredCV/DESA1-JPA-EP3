package pe.isil.springdatajpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.springdatajpademo.entity.Pais;
import pe.isil.springdatajpademo.service.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @PostMapping("/add")
    public void addPais(@RequestBody Pais pais){
        paisService.addPais(pais);
    }
}
