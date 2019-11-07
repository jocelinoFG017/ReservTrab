package br.edu.iffar.reserv.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Entidade que representa uma reserva feita pelo cliente
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:29:07 PM
 */
@Entity
public class Reserva implements IEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReserva;
	// data da realizacao da reserva
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataReserva;
	// data prevista para entrada no quarto
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataEntrada;
	// data prevista para saida do quarto
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataSaida;
	// quantidade de pessoas que se hospedarão
	@Column(nullable = false)
	private int quantidadeHospede;
	// define o quarto
	@ManyToOne
	@JoinColumn(name = "idQuarto", nullable = false)
	private Quarto quarto;
	// define o cliente que esta reservando
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;
	// funcionario que verifica a reserva
	@ManyToOne
	@JoinColumn(name = "idFuncionario")
	private Funcionario funcionario;
	// valor da reserva
	@Column(nullable = false)
	private double valor;

	public long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getQuantidadeHospede() {
		return quantidadeHospede;
	}

	public void setQuantidadeHospede(int quantidadeHospede) {
		this.quantidadeHospede = quantidadeHospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getID() {
		return getIdReserva();
	}

	public void setID(long chave) {
		setIdReserva(chave);
	}

}
