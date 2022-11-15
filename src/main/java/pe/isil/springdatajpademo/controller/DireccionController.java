package pe.isil.springdatajpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Direccion;
import pe.isil.springdatajpademo.repository.DireccionRepository;
import pe.isil.springdatajpademo.service.DireccionService;

import java.util.List;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @PostMapping("/add")
    public void addDireccion(@RequestBody  Direccion direccion){
        direccionService.addDireccion(direccion);
    }
    @GetMapping("/getbyciudad")
    public List<Cliente> getByCiudad(@RequestParam Long idCiudad){
        return direccionService.getByCiudad(idCiudad);
    }

    @GetMapping("/getbypais")
    public List<Cliente> getByPais(@RequestParam Long idPais){
        return direccionService.getByPais(idPais);
    }


}
