package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Kata doesn't make it clear, but I'm assuming that the Two Pairs must have
 * different numbers.
 */
public class TwoPairsTest {

	@Test
	public void shouldScoreOnePairAsZero() {
		ScoringStrategy underTest = ScoringStrategies.twoPairs();

		int result = underTest.compute(3, 3, 3, 1, 2);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScore2sAnd3s() {

		ScoringStrategy underTest = ScoringStrategies.twoPairs();

		int result = underTest.compute(3, 3, 2, 1, 2);

		assertThat(result, is((3 * 2) + (2 * 2)));
	}
}
