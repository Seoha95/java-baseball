package baseball.view;

public class OutputView {
	private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
	private static final String USER_INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
	private static final String GAME_OVER_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private static final String ISRESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public void printStart() {
		System.out.println(GAME_START_MESSAGE);
	}

	public void printInputNumber() {
		System.out.print(USER_INPUT_NUMBER_MESSAGE);
	}

	public void printIsRestart() {
		System.out.println(GAME_OVER_MESSAGE);
		System.out.println(ISRESTART_MESSAGE);

	}

}