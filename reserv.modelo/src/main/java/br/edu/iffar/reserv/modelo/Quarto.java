package br.edu.iffar.reserv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Entidade que representa um quarto que pode ser reservado
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:14:03 PM
 */
@Entity
public class Quarto implements IEntidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idQuarto;
	// quantidade de pessoas que o quarto comporta
	@Column(nullable=false)
	private int capacidade;
	// agrupa os quartos, ex. standard, luxo, suíte etc
	@Column(length=20, nullable=false)
	private String tipoQuarto;
	// tamanho em mt quadrados
	@Column
	private double tamanho;

	public long getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(long idQuarto) {
		this.idQuarto = idQuarto;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public long getID() {
		return getIdQuarto();
	}

	public void setID(long chave) {
		setIdQuarto(chave);		
	}

}
