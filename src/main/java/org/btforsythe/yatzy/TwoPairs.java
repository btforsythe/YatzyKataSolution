package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollStream.stream;

public class TwoPairs implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		if (pairCountIn(rolls) < 2) {
			return 0;
		}
		return stream(rolls).pairs().sum() * 2;
	}

	private long pairCountIn(int... rolls) {
		return stream(rolls).pairs().count();
	}

}
