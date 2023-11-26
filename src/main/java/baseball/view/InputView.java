package baseball.view;

import java.util.List;

import baseball.util.Parser;
import baseball.validator.ValidateInputNumber;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

	public List<Integer> generateAnswer() {
		String playerNumber = Console.readLine();
		ValidateInputNumber.validateBaseballNumber(playerNumber);
		List<Integer> player = Parser.changeNumber(playerNumber);
		return player;
	}

}
