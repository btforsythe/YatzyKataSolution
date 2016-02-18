package org.btforsythe.yatzy;

import static java.util.Arrays.stream;

public class Chance implements Roll {

	private final int[] rolls;

	public Chance(int... rolls) {
		this.rolls = rolls;
	}

	@Override
	public int score() {
		return stream(rolls).sum();
	}

}
