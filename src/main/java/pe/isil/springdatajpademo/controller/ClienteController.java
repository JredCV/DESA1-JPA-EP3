package pe.isil.springdatajpademo.controller;

import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Direccion;
import pe.isil.springdatajpademo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public void addCliente(@RequestBody  Cliente cliente){
        clienteService.addCliente(cliente);
    }

    @GetMapping("/findall")
    public List<Cliente> getAllCliente(){
        return clienteService.getAllCliente();
    }

    @GetMapping("/getbyemail")
    public Cliente getByEmail(@RequestParam String email){
        return clienteService.findByEmail(email);
    }

   @GetMapping("/getbyciudad")
    public List<Cliente> getByCiudad(@RequestParam String ciudad){
     return clienteService.getByCiudad(ciudad);
   }

   @GetMapping("/getbypais")
    public List<Cliente> getByPais(@RequestParam String pais){
        return clienteService.getByPais(pais);
    }

    @PostMapping("/updatecliente")
    public void updateCliente(@RequestBody Cliente cliente,@RequestParam String email){
        clienteService.updateCustomer(cliente, email);
    }

    @DeleteMapping("/deletecliente")
    public void deleteCliente(@RequestParam Long id){
        clienteService.deleteCliente(id);
    }


}
