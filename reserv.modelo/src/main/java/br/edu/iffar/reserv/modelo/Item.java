package br.edu.iffar.reserv.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Entidade que representa um item presente no quarto, como por exemplo,
 * frigobar, cama de casal, secador de cabelo entre outros
 * </p>
 * 
 * @author Professor
 * @since 19/08/2019 20:04
 */
@Entity
public class Item implements IEntidade {
	// chave pri maria
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idItem;
	// descreve o item do quarto
	@Column(length=50, nullable=false)
	private String descricao;

	public long getIdItem() {
		return idItem;
	}

	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getID() {
		return getIdItem();
	}

	public void setID(long chave) {
		setIdItem(chave);
	}

}
