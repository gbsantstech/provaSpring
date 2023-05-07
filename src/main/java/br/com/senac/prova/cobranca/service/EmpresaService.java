package br.com.senac.prova.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.prova.cobranca.entites.Empresa;
import br.com.senac.prova.cobranca.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository repoEmpresa;
	
	public Empresa salvar(Empresa empresa){
		return repoEmpresa.save(empresa);
	}
}
