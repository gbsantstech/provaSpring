package br.com.senac.prova.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.senac.prova.cobranca.service.DevedorService;

@Controller
public class DevedorController {
	
	@Autowired
	private DevedorService devedorService;
}
