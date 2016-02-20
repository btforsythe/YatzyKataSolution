package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollStream.stream;

import java.util.Arrays;

public class ScoringStrategies {

	public static ScoringStrategy chance() {
		return rolls -> Arrays.stream(rolls).sum();
	}

	public static ScoringStrategy pair() {
		return new Pair();
	}

	public static ScoringStrategy twoPairs() {
		return new TwoPairs();
	}

	public static ScoringStrategy diceWithPips(int pips) {
		return rolls -> stream(rolls).countWithPips(pips) * pips;
	}

	public static ScoringStrategy fourOfAKind() {
		return rolls -> stream(rolls).fourOfAKind() * 4;
	}

}
