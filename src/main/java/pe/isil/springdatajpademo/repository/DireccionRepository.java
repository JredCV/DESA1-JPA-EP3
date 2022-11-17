package pe.isil.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.springdatajpademo.entity.Direccion;

import java.util.List;

public interface DireccionRepository extends JpaRepository<Direccion,Long> {

    List<Direccion> findDireccionByCiudad_Id (Long id);

    List<Direccion> findDireccionByPais_Id (Long id);
}
