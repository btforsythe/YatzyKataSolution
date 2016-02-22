package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollsParser.parse;

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
		return rolls -> parse(rolls).countWithPips(pips) * pips;
	}

	public static ScoringStrategy fourOfAKind() {
		return nOfAKind(4);
	}

	private static ScoringStrategy nOfAKind(int n) {
		return rolls -> parse(rolls).nOfAKind(n) * n;
	}

	public static ScoringStrategy threeOfAKind() {
		return nOfAKind(3);
	}

	public static ScoringStrategy yatzy() {
		return ScoringStrategy.NULL;
	}

}
