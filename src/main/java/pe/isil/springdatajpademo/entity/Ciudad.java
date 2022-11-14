package pe.isil.springdatajpademo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_ciudad")
public class Ciudad {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
