package siddu.springcert.spring5petclinic.springsiddupetclinic.service;

import java.util.Set;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Vet;


public interface VetService {
	Vet findById(Long id);
	Vet save(Vet Vet);
	Set<Vet> findAll();
}
