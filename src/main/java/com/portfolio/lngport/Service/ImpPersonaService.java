    
package com.portfolio.lngport.Service;

import com.portfolio.lngport.Entity.Persona;
import com.portfolio.lngport.Interface.IPersonaService;
import com.portfolio.lngport.Repository.IPersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    


    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }


    public void savePersona(Persona persona) {
      ipersonaRepository.save(persona);
    }


    public void deletePersona(Long id) {
       ipersonaRepository.deleteById(id);
    }


    public Persona findPersona(Long id) {
      Persona persona = ipersonaRepository.findById(id).orElse(null);
      return persona;
    }
    
}