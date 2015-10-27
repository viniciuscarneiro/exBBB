package br.com.blacksheep.strategy;

import java.util.Scanner;

import br.com.blacksheep.strategy.call.type.CallType;
import br.com.blacksheep.strategy.exception.CustomException;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o número de telefone para ser discado: ");
			Integer numberToCall = input.nextInt();
			System.out.println("Digite o tipo de chamada: [1] - Á Cobrar; [2] - Local; [3] - Internacional; ");
			int callType = input.nextInt();
			MobilePhone mobilePhone = new MobilePhone();
			try {
				mobilePhone.setCall(CallType.parse(callType).getCall());
				mobilePhone.getCall().call(numberToCall);
			} catch (CustomException e) {
				e.printStackTrace();
			}
		}
	}
}
