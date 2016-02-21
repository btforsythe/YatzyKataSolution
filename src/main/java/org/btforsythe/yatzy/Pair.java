package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollsParser.parse;

public class Pair implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		int highestPair = parse(rolls).pairs().max().orElse(0);

		return highestPair * 2;
	}
}
