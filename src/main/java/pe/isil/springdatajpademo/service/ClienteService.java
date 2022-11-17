package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Ciudad;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.repository.ClienteRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void addCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }


    public Cliente findByEmail(String email){
        return clienteRepository. findClienteByEmail(email);
    }

    public List<Cliente> getByCiudad(String descripcion){
        return clienteRepository.findClienteByDireccion_Ciudad_Descripcion(descripcion);
    }

    public List<Cliente> getByPais(String descripcion){
        return clienteRepository.findClienteByDireccion_Pais_Descripcion(descripcion);
    }

    @Transactional
    public void updateCustomer(Cliente cliente,String email){

        Cliente clienteToUpdate = clienteRepository.findClienteByEmail(email);

        if(clienteToUpdate!= null){
            clienteToUpdate.setEmail(cliente.getEmail()!=null?
                    cliente.getEmail(): clienteToUpdate.getEmail());


            clienteToUpdate.setNombre(cliente.getNombre()!=null?
                    cliente.getNombre() : clienteToUpdate.getNombre());


            clienteToUpdate.setDireccion(cliente.getDireccion()!=null?
                    cliente.getDireccion() : clienteToUpdate.getDireccion());
            //customerRepository.save(customerToUpdate);
        }
    }

}
