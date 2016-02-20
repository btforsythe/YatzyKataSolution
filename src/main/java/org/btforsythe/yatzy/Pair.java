package org.btforsythe.yatzy;

public class Pair implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		DieRollStream stream = new DieRollStream(rolls);
		int highestPair = stream.pairs().stream().mapToInt(Integer::intValue).max().orElse(0);

		return highestPair * 2;
	}
}
