package baseball.domain;

import java.util.List;

public class GameResult {

	private final int ballCount;
	private final int strikeCount;

	private GameResult(final List<Integer> playerNumber, final Computer computerNumber) {
		ballCount = computerNumber.ballCount(playerNumber);
		strikeCount = computerNumber.strikeCount(playerNumber);
	}

	public static GameResult create(final List<Integer> playerNumber, final Computer computerNumber) {
		return new GameResult(playerNumber, computerNumber);
	}

	public String result() {
		if (ballCount == 0 && strikeCount == 0) {
			return "낫싱";
		}
		if (strikeCount == 3) {
			return strikeCount + "스트라이크";
		}

		return ballCount + "볼" + strikeCount + "스트라이크";
	}
}
