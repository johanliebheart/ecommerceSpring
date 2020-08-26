package com.store.demo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	@GetMapping("listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Lista de clientes");
		return "listar";
	}

}
