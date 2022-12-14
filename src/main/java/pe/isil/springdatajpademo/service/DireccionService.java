package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Direccion;
import pe.isil.springdatajpademo.repository.DireccionRepository;

import java.util.List;
import java.util.Optional;


@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public void addDireccion(Direccion direccion){
        direccionRepository.save(direccion);
    }

    public List<Direccion> getAllDireccion(){
        return direccionRepository.findAll();
    }

    public List<Direccion> getByCiudad(Long id){
        return direccionRepository.findDireccionByCiudad_Id(id);
    }

    public List<Direccion> getByPais(Long id){
        return direccionRepository.findDireccionByPais_Id(id);
    }


    public void deleteDir(Long id){
        Optional<Direccion> dirToDelete = direccionRepository.findById(id);
        if(dirToDelete.isPresent()){
            direccionRepository.delete(dirToDelete.get());
        }else{
            throw new RuntimeException("La direccion no existe");
        }
    }
}
