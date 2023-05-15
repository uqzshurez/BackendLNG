    package com.portfolio.lngport.Service;

import com.portfolio.lngport.Entity.Persona;
import com.portfolio.lngport.Interface.IPersonaService;
import com.portfolio.lngport.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpPersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        return ipersonaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return ipersonaRepository.findById(id).orElse(null);
    }
}
