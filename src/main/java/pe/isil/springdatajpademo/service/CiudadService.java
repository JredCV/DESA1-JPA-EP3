package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Ciudad;
import pe.isil.springdatajpademo.repository.CiudadRepository;


@Service
public class CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public void addCiudad(Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }
}

