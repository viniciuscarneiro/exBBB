package br.com.blacksheep.strategy;

import br.com.blacksheep.strategy.call.Call;

public class MobilePhone {

	private Call call;

	public Call getCall() {
		return call;
	}

	public void setCall(Call call) {
		this.call = call;
	}

}
