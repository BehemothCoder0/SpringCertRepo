package siddu.springcert.spring5petclinic.springsiddupetclinic.service;

import java.util.Set;

public interface BaseService<PetClinicType, ID> {
	public PetClinicType findById(ID Id);
	public PetClinicType save(PetClinicType petClinicTypeObject);
	public Set<PetClinicType> findAll();
	public void delete(PetClinicType petClinicTypeObject);
	public void deleteById(ID id);
}
