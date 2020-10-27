package services;

import com.eliasnorrby.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}
