package org.btforsythe.yatzy;

import static org.btforsythe.yatzy.DieRollsParser.parse;

public class TwoPairs implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {

		if (pairCountIn(rolls) < 2) {
			return 0;
		}
		return parse(rolls).pairs().sum() * 2;
	}

	private long pairCountIn(int... rolls) {
		return parse(rolls).pairs().count();
	}

}
