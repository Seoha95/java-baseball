package baseball.validator;

import baseball.constans.ExceptionMessage;

public class ValidateInputNumber {

	public static void validateBaseballNumber(String input) {
		IsEmpty(input);
		inputSize(input);
		if (numberDuplicate(input)) {
			throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_ERROR.getMessage());
		}
	}

	private static void IsEmpty(String input) {
		if (input.isEmpty() || input.isBlank()) {
			throw new IllegalArgumentException(ExceptionMessage.EMPTY_ERROR.getMessage());
		}

	}

	private static void inputSize(String input) {
		if (!input.matches("\\d{3}")) {
			throw new IllegalArgumentException(ExceptionMessage.NUMBER_OF_OUT_BOUND_ERROR.getMessage());
		}

	}

	private static boolean numberDuplicate(String input) {

		return input.chars().distinct().count() != input.length();
	}
}
