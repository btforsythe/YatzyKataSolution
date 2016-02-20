package org.btforsythe.yatzy;

import static java.util.Arrays.stream;

public class ScoringStrategies {

	public static ScoringStrategy chance() {
		return (rolls) -> {
			return stream(rolls).sum();
		};
	}

	public static ScoringStrategy twoOfAKind() {
		return new TwoOfAKind();
	}

}
