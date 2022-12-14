package pe.isil.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.springdatajpademo.entity.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    Cliente findClienteByEmail(String email);
    List<Cliente> findClienteByDireccion_Ciudad_Descripcion(String descripcion);
    List<Cliente> findClienteByDireccion_Pais_Descripcion(String descripcion);
}
