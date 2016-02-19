package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RollTest {

	private Roll underTest;

	private final int[] dieRolls = {1, 2, 3, 4, 5};

	private int[] actualRolls;
	
	@Before
	public void setup() {
		underTest = new Roll(dieRolls);
	}
	
	@Test
	public void shouldScore() {

		int result = underTest.score((rolls) -> { return 0;});

		assertThat(result, is(greaterThanOrEqualTo(0)));
	}

	@Test
	public void shouldScoreUsingStrategy() {

		int expectedScore = 42;
		ScoringStrategy strategy = (rolls) -> { return expectedScore; };

		int result = underTest.score(strategy);

		assertThat(result, is(expectedScore));
	}
	
	@Test
	public void shouldSupplyRollsToStrategy() {

		ScoringStrategy strategy = (rolls) -> { actualRolls = rolls; return -1; };

		underTest.score(strategy);

		assertThat(actualRolls, is(dieRolls));
	}
}
