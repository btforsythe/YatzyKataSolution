package org.btforsythe.yatzy;

public interface ScoringStrategy {

	static ScoringStrategy NULL = rolls -> 0;

	int compute(int... rolls);
}
