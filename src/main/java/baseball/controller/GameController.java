package baseball.controller;

import java.util.List;

import baseball.domain.Computer;
import baseball.domain.GameResult;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private final InputView inputView;
	private final OutputView outputView;

	public GameController(InputView inputView, OutputView outputView) {
		this.inputView = inputView;
		this.outputView = outputView;
	}

	public void run() {

		outputView.printStart();
		do {
			gameStart();
		} while (reStart());
	}

	private void gameStart() {
		String matchResult;
		Computer computer = new Computer();
		do {
			outputView.printInputNumber();
			List<Integer> playerNumber = inputView.generateAnswer();
			GameResult gameResult = GameResult.create(playerNumber, computer);
			matchResult = gameResult.result();
			outputView.printResult(matchResult);
		} while (!matchResult.equals("3스트라이크"));

	}

	private boolean reStart() {
		outputView.printIsRestart();
		if (inputView.isNewGame() == 1) {
			return true;
		}

		return false;
	}

}
