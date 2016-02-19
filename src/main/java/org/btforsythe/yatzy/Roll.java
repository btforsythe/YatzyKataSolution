package org.btforsythe.yatzy;

public class Roll {

	private int[] dieRolls;

	public Roll(int... dieRolls) {
		this.dieRolls = dieRolls;
	}

	public int score(ScoringStrategy using) {
		return using.compute(dieRolls);
	}

}
