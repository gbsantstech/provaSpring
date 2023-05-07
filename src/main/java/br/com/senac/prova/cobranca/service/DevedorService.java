package br.com.senac.prova.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.prova.cobranca.entites.Devedor;
import br.com.senac.prova.cobranca.repository.DevedorRepository;

@Service
public class DevedorService {
	
	@Autowired
	DevedorRepository repoDevedor;
	
	public Devedor salvar(Devedor devedor){
		return repoDevedor.save(devedor);
	}
}
