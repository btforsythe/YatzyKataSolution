package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PairTest {

	private ScoringStrategy underTest;

	@Before
	public void setup() {
		underTest = ScoringStrategies.pair();
	}

	@Test
	public void shouldScoreZero() {

		int result = underTest.compute(1, 2, 3, 4, 5);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScorePairOfThrees() {

		int result = underTest.compute(1, 2, 3, 4, 3);

		assertThat(result, is(3 + 3));
	}

	@Test
	public void shouldScoreHighestPair() {

		int highest = 4;
		int result = underTest.compute(1, 3, 3, highest, highest);

		assertThat(result, is(highest + highest));
	}
}
