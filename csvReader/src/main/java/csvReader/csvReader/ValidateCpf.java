package csvReader.csvReader;

import java.util.regex.Pattern;

public class ValidateCpf {
	
	private static final int MAX_CPF_DIGITS = 11;

	public static void main( String[] args )
    {
    	ValidateCpf obj = new ValidateCpf();
    	obj.run();
    }

	private void run() {
		
		String cpf = "09161059626";
		if(CpfValidator.validate("09161059626")) {
			System.out.println("CPF Válido!");
		} else {
			System.out.println("CPF INVALIDO!");
		}
	}
	
	private static String calculateVerifierDigits(String cpfWithoutDigits) {
		Integer firstDigit, secondDigit;
		
		int sum = 0;
		final int firstDigitWeight = 10;
		final int secondDigitWeight = 11;
		firstDigit = calculateDigit(cpfWithoutDigits, sum, firstDigitWeight, null);
		
		sum = 0;
		secondDigit = calculateDigit(cpfWithoutDigits, sum, secondDigitWeight, firstDigit);
		
		return firstDigit.toString() + secondDigit.toString();
	}

	private static Integer calculateDigit(String cpfWithoutDigits, int sum, int weight, Integer firstDigit) {
		Integer primDig;
		int newSum = sum;
		int newWeight = weight;
		for (int i = 0; i < cpfWithoutDigits.length(); i++) {
			newSum += Integer.parseInt(cpfWithoutDigits.substring(i, i + 1)) * newWeight--;
		}

		if (firstDigit != null) {
			newSum += firstDigit.intValue() * 2;
		}
		
		if (newSum % 11 == 0 || newSum % 11 == 1) {
			primDig = Integer.valueOf(0);
		} else {
			primDig = Integer.valueOf(11 - (newSum % 11));
		}
		return primDig;
	}

	public static boolean validate(String cpf) {
		final int cpfWithoutDigitsNumberOfDigits = 9;
		
		if (Pattern.matches("^([0-9])\\1{10}$", cpf) || cpf.length() != MAX_CPF_DIGITS) {
			return false;
		}

		String numDig = cpf.substring(0, cpfWithoutDigitsNumberOfDigits);
		return calculateVerifierDigits(numDig).equals(cpf.substring(cpfWithoutDigitsNumberOfDigits, MAX_CPF_DIGITS));
	}
	
}
