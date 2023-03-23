
package com.backend.api.repository;

import com.backend.api.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository  extends JpaRepository <Persona, Long>{
    
}
