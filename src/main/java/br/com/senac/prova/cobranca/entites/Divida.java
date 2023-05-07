package br.com.senac.prova.cobranca.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_divida")
public class Divida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int valor;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	

	@ManyToOne
	@JoinColumn(name = "devedor_id")
	private Devedor devedor;

	public double getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
