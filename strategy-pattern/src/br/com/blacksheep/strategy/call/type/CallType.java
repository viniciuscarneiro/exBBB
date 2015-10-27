package br.com.blacksheep.strategy.call.type;

import br.com.blacksheep.strategy.call.Call;
import br.com.blacksheep.strategy.exception.CustomException;

public enum CallType {

	COLLECT_CALL("a cobrar") {

		@Override
		public Call getCall() {
			return new CollectCall();
		}

	},
	LOCAL("local") {

		@Override
		public Call getCall() {
			return new Local();
		}

	},
	INTERNATIONAL("internacional") {

		@Override
		public Call getCall() {
			return new International();
		}

	};

	private CallType(String description) {
		this.description = description;
	}

	public abstract Call getCall();

	private String description;

	public String getDescription() {
		return description;
	}

	public static CallType parse(int callType) throws CustomException {
		try {
			return CallType.values()[callType - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new CustomException("Tipo de chamada inválido.");
		}
	}
}
