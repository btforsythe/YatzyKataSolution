package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollStream.stream;

public class Pair implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		int highestPair = stream(rolls).pairs().max().orElse(0);

		return highestPair * 2;
	}
}
