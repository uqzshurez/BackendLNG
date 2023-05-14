
package com.portfolio.lngport.Controller;

import com.portfolio.lngport.Entity.Persona;
import com.portfolio.lngport.Interface.IPersonaService;
import com.portfolio.lngport.Service.ImpPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "https://portfolio-frontend-lng.web.app")
public class PersonaController {
    @Autowired
    IPersonaService personaService;
    
    @GetMapping("/traer")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona persona){
       personaService.savePersona(persona);
       return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg){
        Persona persona = personaService.findPersona(id);
    
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
    
        personaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/traer/perfil")
    public Persona findPersona(){
        return personaService.findPersona((long)4);
    }
}
