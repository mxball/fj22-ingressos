package br.com.caelum.ingresso.modelo;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sessao {

	@Id
	@GeneratedValue
	private Integer id;
	private LocalTime horario;
	@ManyToOne
	private Cinema cinema;

	/**
	 * @deprecated hibernate only
	 */
	protected Sessao(){	
	}
	
	public Sessao(LocalTime horario, Cinema cinema) {
		this.horario = horario;
		this.cinema = cinema;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
}
