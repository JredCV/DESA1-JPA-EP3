package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Ciudad;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.repository.ClienteRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
            clienteToUpdate.setApellido(cliente.getApellido()!=null?
                    cliente.getApellido(): clienteToUpdate.getApellido());
            clienteToUpdate.setNombre(cliente.getNombre()!=null?
                    cliente.getNombre() : clienteToUpdate.getNombre());
            clienteToUpdate.setDireccion(cliente.getDireccion()!=null?
                    cliente.getDireccion() : clienteToUpdate.getDireccion());
        }
    }

    public void deleteCliente(Long id){
        Optional<Cliente> clienteToDelete = clienteRepository.findById(id);
        if(clienteToDelete.isPresent()){
            clienteRepository.delete(clienteToDelete.get());
        }else{
            throw new RuntimeException("El cliente no existe");
        }
    }

}
