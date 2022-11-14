package pe.isil.springdatajpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.springdatajpademo.entity.Direccion;
import pe.isil.springdatajpademo.repository.DireccionRepository;
import pe.isil.springdatajpademo.service.DireccionService;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;


}
