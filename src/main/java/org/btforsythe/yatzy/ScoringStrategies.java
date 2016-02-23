package org.btforsythe.yatzy;

import static java.util.Arrays.asList;
import static org.btforsythe.yatzy.DieRollsParser.parse;
import static org.btforsythe.yatzy.ScoringStrategy.NULL;

import java.util.Arrays;
import java.util.stream.Collectors;

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
		return rolls -> parse(rolls).nOfAKind(5) > 0? 50: 0;
	}

	public static ScoringStrategy smallStraight() {
		return rolls -> Arrays.stream(rolls).boxed().collect(Collectors.toList()).equals(asList(1, 2, 3, 4, 5))? 15: 0;
	}

}
