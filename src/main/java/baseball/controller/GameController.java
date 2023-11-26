package baseball.controller;

import java.util.List;

import baseball.domain.Computer;
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
		Computer computer = new Computer();
		do {
			gameStart(computer);
		} while (reStart());
	}

	private void gameStart(Computer computer) {
		outputView.printInputNumber();
		List<Integer> playerInput = inputView.generateAnswer();

	}

	private boolean reStart() {
		return false;
	}

}
