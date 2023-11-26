package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class Parser {
	public static List<Integer> changeNumber(String playerNumber) {

		List<Integer> userInput = new ArrayList();
		for (char player : playerNumber.toCharArray()) {
			userInput.add(Character.getNumericValue(player));
		}
		return userInput;
	}
}
