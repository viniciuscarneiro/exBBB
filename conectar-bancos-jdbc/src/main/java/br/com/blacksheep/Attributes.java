package br.com.blacksheep;

public enum Attributes {

	AGENDAMENTO_EXECUCAO_INICIO_HORA("EXECUCAOINICIO_HORA"),

	AGENDAMENTO_EXECUCAO_INICIO_MINUTO("EXECUCAOINICIO_MINUTO"),

	AGENDAMENTO_EXECUCAO_INTERVALO_HORA("EXECUCAOINTERVALO_HORA"),

	AGENDAMENTO_EXECUCAO_INTERVALO_MINUTO("EXECUCAOINTERVALO_MINUTO");

	private String name;

	private Attributes(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
