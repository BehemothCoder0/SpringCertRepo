package siddu.springcert.spring5petclinic.springsiddupetclinic.service;

import java.util.Set;

public interface BaseService<PetClinicType, ID> {
	PetClinicType findById(ID Id);
	PetClinicType save(PetClinicType petClinicTypeObject);
	Set<PetClinicType> findAll();
	void delete(PetClinicType petClinicTypeObject);
	void deleteById(ID id);
}
