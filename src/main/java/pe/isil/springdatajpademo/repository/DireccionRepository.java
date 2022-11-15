package pe.isil.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.springdatajpademo.entity.Cliente;
import pe.isil.springdatajpademo.entity.Direccion;

import java.util.List;

public interface DireccionRepository extends JpaRepository<Direccion,Long> {


    List<Cliente> findDireccionByCiudad(Long idCiudad);

    List<Cliente> findDireccionByPais (Long idPais);
}
