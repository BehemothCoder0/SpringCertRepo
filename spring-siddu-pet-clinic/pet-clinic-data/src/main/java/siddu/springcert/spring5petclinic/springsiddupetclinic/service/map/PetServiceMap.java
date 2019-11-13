package siddu.springcert.spring5petclinic.springsiddupetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Pet;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
