package siddu.springcert.spring5petclinic.springsiddupetclinic.service;

import java.util.Set;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Pet;


public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
