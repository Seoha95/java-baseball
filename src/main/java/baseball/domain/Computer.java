package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

	private static final int COMPUTER_SIZE = 3;
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 9;
	private final List<Integer> computerNumbers;

	public Computer() {
		this.computerNumbers = generateRandomNumber();
	}

	private List<Integer> generateRandomNumber() {
		List<Integer> computer = new ArrayList<>();
		while (computer.size() < COMPUTER_SIZE) {
			int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
			if (!computer.contains(randomNumber)) {
				computer.add(randomNumber);
			}
		}
		return computer;
	}

	public int ballCount(List<Integer> playerNumbers) {
		return (int) IntStream.range(0, COMPUTER_SIZE).filter(i -> playerNumbers.contains(computerNumbers.get(i))
				&& !playerNumbers.get(i).equals(computerNumbers.get(i))).count();
	}

	public int strikeCount(List<Integer> playerNumbers) {
		return (int) IntStream.range(0, COMPUTER_SIZE).filter(i -> playerNumbers.get(i).equals(computerNumbers.get(i)))
				.count();
	}

}