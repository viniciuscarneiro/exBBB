package br.com.blacksheep.strategy.call.type;

import br.com.blacksheep.strategy.call.Call;

public class CollectCall implements Call {

	@Override
	public void call(int numberToCall) {
		System.out.println(String.format("Fazendo chamada [%s] para o numero[%s]", CallType.COLLECT_CALL.getDescription(), numberToCall));
	}

}
