package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Direccion;
import pe.isil.springdatajpademo.repository.DireccionRepository;

import java.util.List;


@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public void addDireccion(Direccion direccion){
        direccionRepository.save(direccion);
    }

    public List<Cliente> getByCiudad(Long idCiudad){
        return direccionRepository.findDireccionByCiudad(idCiudad);
    }

    public List<Cliente> getByPais(Long idPais){
        return direccionRepository.findDireccionByPais(idPais);
    }
}
