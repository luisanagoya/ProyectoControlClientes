/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;

/**
 *
 * @author jurad
 */
public interface PersonaService {
    
    public List<Persona> listarPersona ();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
