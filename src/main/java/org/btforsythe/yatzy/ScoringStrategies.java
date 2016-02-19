package org.btforsythe.yatzy;

public class ScoringStrategies {

	public static ScoringStrategy chance() {
		return (rolls) -> { return 0;};
	}

}
