package baseball.constans;

public enum ExceptionMessage {

	EMPTY_ERROR("숫자를 입력해주세요."), NUMBER_OF_OUT_BOUND_ERROR("3자리수를 입력해주세요."), DUPLICATE_ERROR("중복된 숫자입니다. 디시 입력해주세요.");

	private final String message;

	ExceptionMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
