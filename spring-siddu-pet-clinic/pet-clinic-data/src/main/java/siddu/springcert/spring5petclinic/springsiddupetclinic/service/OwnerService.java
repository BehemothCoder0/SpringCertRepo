package siddu.springcert.spring5petclinic.springsiddupetclinic.service;

import java.util.Set;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Owner;

public interface OwnerService extends BaseService<Owner,Long>{
	Owner findByLastName(String lastName);
}
