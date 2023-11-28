package baseball.controller;

import java.util.List;

import baseball.domain.Computer;
import baseball.domain.GameResult;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private final InputView inputView;
	private final OutputView outputView;
	private final Computer computer;

	public GameController(InputView inputView, OutputView outputView) {
		this.inputView = inputView;
		this.outputView = outputView;
		this.computer = new Computer();
	}

	public void run() {
		outputView.printStart();
		do {
			gameStart(computer);
		} while (true);
	}

	private void gameStart(Computer computer) {
		outputView.printInputNumber();
		List<Integer> playerNumber = inputView.generateAnswer();
		GameResult gameResult = GameResult.create(playerNumber, computer);
		outputView.printResult(gameResult.result());
	}

	private boolean reStart() {
		return false;
	}

}
