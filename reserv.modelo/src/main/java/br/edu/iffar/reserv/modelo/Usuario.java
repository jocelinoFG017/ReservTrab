package br.edu.iffar.reserv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Entidade genérica que representa um usuário 
 * do sistema. Não existirá usuário sem 
 * especialização, sendo sempre um cliente ou 
 * usuário.
* </p> 
* @author Professor
* @since Aug 19, 2019 8:22:31 PM
*/
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Usuario implements IEntidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUsuario;
	@Column(length=50, nullable=false)
	private String nome;
	@Column(length=15)
	private String telefone;
	@Column(length=100, nullable=false)
	private String email;
	@Column(length=150, nullable=false)
	private String senha;
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public long getID() {
		return getIdUsuario();
	}
	public void setID(long chave) {
		setIdUsuario(chave);
	}
}
