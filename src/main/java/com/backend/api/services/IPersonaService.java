
package com.backend.api.services;

import com.backend.api.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    //agregado 
    public void actualizarPersona (Persona per);
}
