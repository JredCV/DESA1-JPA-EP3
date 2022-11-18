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

    @GetMapping("/findall")
    public List<Direccion> getAllDireccion(){
        return direccionService.getAllDireccion();
    }
   @GetMapping("/getbyciudad")
    public List<Direccion> getByCiudad(@RequestParam Long id){
        return direccionService.getByCiudad(id);
    }

    @GetMapping("/getbypais")
    public List<Direccion> getByPais(@RequestParam Long id){
        return direccionService.getByPais(id);
    }

    @DeleteMapping("/deletedir")
    public void deleteDireccion(@RequestParam Long id){
        direccionService.deleteDir(id);
    }


}
