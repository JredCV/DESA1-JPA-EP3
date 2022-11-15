package pe.isil.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.springdatajpademo.entity.Ciudad;
import pe.isil.springdatajpademo.entity.Cliente;

public interface CiudadRepository extends JpaRepository<Ciudad,Long> {
}
