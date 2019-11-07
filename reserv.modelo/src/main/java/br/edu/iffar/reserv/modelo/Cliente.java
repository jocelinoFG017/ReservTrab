package br.edu.iffar.reserv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * <p>
 * Entidade que representa um cliente que realiza as reservas
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:25:10 PM
 */
@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Cliente extends Usuario  {
	@Column(length=80)
	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
