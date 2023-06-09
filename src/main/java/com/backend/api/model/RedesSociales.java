
package com.backend.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class RedesSociales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
  
    
    public RedesSociales(){
               
    }
    public RedesSociales(Long id, String url){
        this.id = id;
        this.url = url;
        
        
    }
    
}