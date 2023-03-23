
package com.backend.api.controller;


import com.backend.api.model.Persona;
import com.backend.api.services.IPersonaService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
        
public class controller {
    
  @Autowired
  private IPersonaService persoServ;
  
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
        
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/persona")
    public void actualizarPersona (@RequestBody Persona pers){
        persoServ.actualizarPersona(pers);
}
}
