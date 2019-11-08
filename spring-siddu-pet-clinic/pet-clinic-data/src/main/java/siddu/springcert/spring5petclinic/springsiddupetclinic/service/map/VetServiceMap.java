package siddu.springcert.spring5petclinic.springsiddupetclinic.service.map;

import java.util.Set;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Vet;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.BaseService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements BaseService<Vet, Long>{

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		return super.save(vet.getId(), vet);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
