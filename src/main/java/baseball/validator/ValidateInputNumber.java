package baseball.validator;

import baseball.constans.ExceptionMessage;

public class ValidateInputNumber {

	public static void validateBaseballNumber(String input) {
		isEmpty(input);
		inputSize(input);
		if (numberDuplicate(input)) {
			throw new IllegalArgumentException(ExceptionMessage.DUPLICATE_ERROR.getMessage());
		}
	}

	public static void validateReStart(String input) {
		isEmpty(input);
		reStartAnswerSize(input);
		numberOutOfBound(input);
	}

	private static void numberOutOfBound(String input) {
		if (!(input.equals("1") || input.equals("2"))) {
			throw new IllegalArgumentException(ExceptionMessage.NUMBER_OF_OUT_BOUND_ERROR.getMessage());
		}

	}

	private static void reStartAnswerSize(String input) {
		if (!input.matches("\\d{1}")) {
			throw new IllegalArgumentException(ExceptionMessage.NUMBER_OF_OUT_ERROR.getMessage());
		}

	}

	private static void isEmpty(String input) {
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
