package mx.com.gm.dao;

import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jurad
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
