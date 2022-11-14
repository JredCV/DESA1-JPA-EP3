package pe.isil.springdatajpademo.controller;

    import pe.isil.springdatajpademo.entity.Cliente;
    import pe.isil.springdatajpademo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/getbyemail")
    public Cliente getByEmail(@RequestParam String email){
        return clienteService.findByEmail(email);
    }

    @GetMapping("/getbyciudad")
    public List<Cliente> getByCiudad(@RequestParam Long idCiudad){
        return clienteService.getByCiudad(idCiudad);
    }

    @GetMapping("/getbypais")
    public List<Cliente> getByPais(@RequestParam Long idPais){
        return clienteService.getByPais(idPais);
    }
}
