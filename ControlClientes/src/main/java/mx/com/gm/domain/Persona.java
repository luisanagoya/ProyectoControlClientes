package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_persona")
    private  Long idPersona;
    @NotEmpty
    @Email
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String email;
   
    private String telefono;
    
    @NotNull
    private Double saldo;
    
    
    
}
