package pe.isil.springdatajpademo.entity;

import javax.persistence.*;


@Entity
@Table(name = "tbl_cliente", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email",name="email_uique")
})
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    private String apellido;

    private String email;

    @ManyToOne
    @JoinColumn(name = "idDireccion")
    private Direccion direccion;
}
