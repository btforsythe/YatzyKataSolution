package org.btforsythe.yatzy;

public class ScoringStrategies {

	public static ScoringStrategy chance() {
		return (rolls) -> { return rolls.length > 0? rolls[0]: 0;};
	}

}
