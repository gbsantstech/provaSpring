package br.com.senac.prova.cobranca.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_devedor")
public class Devedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDevedor;
	private String nomeDevedor;
	


	public int getIdDevedor() {
		return idDevedor;
	}

	public void setIdDevedor(int idDevedor) {
		this.idDevedor = idDevedor;
	}

	public String getNomeDevedor() {
		return nomeDevedor;
	}

	public void setNomeDevedor(String nomeDevedor) {
		this.nomeDevedor = nomeDevedor;
	}


}
