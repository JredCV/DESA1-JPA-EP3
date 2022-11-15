package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void addCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
    public Cliente findByEmail(String email){
        return clienteRepository.findClienteByEmail(email);
    }

    public List<Cliente> getByCiudad(Long idCiudad){
        return null;
    }

    public List<Cliente> getByPais(Long idPais){
        return null;
    }
}
