package br.edu.iffar.reserv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * <p>
 * Entidade que representa um funcionario
* </p>
* @author Professor
* @since Aug 19, 2019 8:26:45 PM
*/
@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Funcionario extends Usuario {
	@Column(length=30, nullable=false)
	private String setor;
	@Column(length=30)
	private String funcao;
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
