package br.com.senac.prova.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.prova.cobranca.entites.Devedor;

@Repository
public interface DevedorRepository extends JpaRepository<Devedor, Integer> {

}
