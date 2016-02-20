package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollStream.stream;

public class TwoPairs implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		if (stream(rolls).pairs().count() == 2) {
			return 10;
		}

		return 0;
	}

}
