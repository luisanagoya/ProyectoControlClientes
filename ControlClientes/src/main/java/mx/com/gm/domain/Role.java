package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author jurad
 */
@Entity
@Data
@Table(name="rol")
public class Role implements Serializable {
    
    private static final long SerialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol; 
    @NotEmpty
    private String nombre;
    
    
    
}
