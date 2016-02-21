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
		return rolls -> parse(rolls).fourOfAKind() * 4;
	}

}
