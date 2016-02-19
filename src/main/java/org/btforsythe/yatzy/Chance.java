package org.btforsythe.yatzy;

import static java.util.Arrays.stream;

public class Chance implements ScoringStrategy {
	@Override
	public int compute(int... rolls) {
		return stream(rolls).sum();
	}
}
