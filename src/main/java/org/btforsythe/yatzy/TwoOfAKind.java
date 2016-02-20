package org.btforsythe.yatzy;

import static java.util.Arrays.stream;

public class TwoOfAKind implements ScoringStrategy {
	@Override
	public int compute(int... rolls) {
		return stream(rolls).filter(e -> {
			return e == 3;
		}).count() >= 2 ? 3 * 2 : 0;
	}
}
