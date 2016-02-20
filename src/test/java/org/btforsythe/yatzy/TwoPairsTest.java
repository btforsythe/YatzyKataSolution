package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Kata doesn't make it clear, but I'm assuming that the Two Pairs must have
 * different numbers.
 */
public class TwoPairsTest {

	private ScoringStrategy underTest;

	@Before
	public void setup() {
		underTest = ScoringStrategies.twoPairs();
	}

	@Test
	public void shouldScoreOnePairAsZero() {

		int result = underTest.compute(3, 3, 3, 1, 2);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScore2sAnd3s() {

		int result = underTest.compute(3, 3, 2, 1, 2);

		assertThat(result, is((2 * 2) + (3 * 2)));
	}

	@Test
	public void shouldScore3sAnd4s() {

		int result = underTest.compute(3, 3, 4, 1, 4);

		assertThat(result, is((3 * 2) + (4 * 2)));
	}
}
