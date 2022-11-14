package pe.isil.springdatajpademo.entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_pais")
public class Pais {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String descripcion;
}
