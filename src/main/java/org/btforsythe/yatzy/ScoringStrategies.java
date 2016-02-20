package org.btforsythe.yatzy;

import static java.util.Arrays.stream;

public class ScoringStrategies {

	public static ScoringStrategy chance() {
		return rolls -> stream(rolls).sum();
	}

	public static ScoringStrategy pair() {
		return new Pair();
	}

	public static ScoringStrategy twoPairs() {
		return new TwoPairs();
	}

}
