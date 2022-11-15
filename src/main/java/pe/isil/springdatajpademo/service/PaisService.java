package pe.isil.springdatajpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Pais;
import pe.isil.springdatajpademo.repository.ClienteRepository;
import pe.isil.springdatajpademo.repository.PaisRepository;

@Service
public class PaisService{
    @Autowired
    private PaisRepository paisRepository;

    public void addPais(Pais pais){paisRepository.save(pais);
    }
}
