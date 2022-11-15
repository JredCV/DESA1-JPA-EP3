package pe.isil.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.springdatajpademo.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais,Long> {
}
