package com.eliasnorrby.springpetclinic.services.map;

import com.eliasnorrby.springpetclinic.model.Vet;
import com.eliasnorrby.springpetclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
