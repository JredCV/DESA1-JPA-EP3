package pe.isil.springdatajpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.springdatajpademo.entity.Ciudad;
import pe.isil.springdatajpademo.service.CiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @PostMapping("/add")
    public void addCiudad(@RequestBody Ciudad ciudad){
        ciudadService.addCiudad(ciudad);
    }
}
