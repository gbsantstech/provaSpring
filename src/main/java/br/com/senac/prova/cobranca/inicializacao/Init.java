package br.com.senac.prova.cobranca.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import br.com.senac.prova.cobranca.entites.Devedor;
import br.com.senac.prova.cobranca.entites.Empresa;
import br.com.senac.prova.cobranca.service.DevedorService;
import br.com.senac.prova.cobranca.service.DividaService;
import br.com.senac.prova.cobranca.service.EmpresaService;

public class Init implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired 
	DevedorService devedorService;
	
	@Autowired
	DividaService dividaService;
	
	@Autowired
	EmpresaService empresaService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Devedor devedor1 = new Devedor();
		devedor1.setNomeDevedor("João");
		devedorService.salvar(devedor1);
		
		Empresa empresa1 = new Empresa();
		empresa1.setNomeEmpresa("Gomes Sardinha");
		empresaService.salvar(empresa1);
		
		System.out.println("Devedor: "+ devedor1.getNomeDevedor());
		System.out.println("Empresa: "+ empresa1.getNomeEmpresa());
	}
	

}
