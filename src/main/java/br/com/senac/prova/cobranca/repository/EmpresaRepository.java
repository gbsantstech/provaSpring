package br.com.senac.prova.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.prova.cobranca.entites.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}