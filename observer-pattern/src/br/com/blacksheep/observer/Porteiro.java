package br.com.blacksheep.observer;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Porteiro extends Thread {

	private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void run() {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				int valor = scanner.nextInt();
				if (valor == 1) {
					ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(LocalTime.now());

					// notifica os observadores

					for (ChegadaAniversarianteObserver observer : observers) {
						observer.chegou(event);
					}
				} else {
					System.out.println("Alarme falso!!!!");
				}
			}
		}

	}
}
