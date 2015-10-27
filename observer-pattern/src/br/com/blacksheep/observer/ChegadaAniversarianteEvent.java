package br.com.blacksheep.observer;

import java.time.LocalTime;

public class ChegadaAniversarianteEvent {

	private final LocalTime hora;

	public ChegadaAniversarianteEvent(LocalTime hora) {
		super();
		this.hora = hora;
	}

	public LocalTime getHora() {
		return hora;
	}

}
