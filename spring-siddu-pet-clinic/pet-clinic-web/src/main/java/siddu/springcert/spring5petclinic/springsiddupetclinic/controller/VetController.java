package siddu.springcert.spring5petclinic.springsiddupetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import siddu.springcert.spring5petclinic.springsiddupetclinic.service.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {
	
	private final VetService vetService;
	
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"","/index","/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
