package siddu.springcert.spring5petclinic.springsiddupetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Owner;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.BaseService;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements BaseService<Owner, Long>{

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}