package pe.isil.springdatajpademo.entity;

import javax.persistence.*;

@Table(name = "tbl_direccion")
@Entity
public class Direccion {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    private String  direccion1;

    private String direccion2;

    @ManyToOne
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "idPais")
    private Pais pais;


}
