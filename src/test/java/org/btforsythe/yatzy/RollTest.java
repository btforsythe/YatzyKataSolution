package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RollTest {

	@Test
	public void shouldScore() {

		Roll underTest = new Roll(1, 2, 3, 4, 5);
		ScoringStrategy strategy = new ScoringStrategy() {
			@Override
			public int compute(int... rolls) {
				return 0;
			}
		};

		int result = underTest.score(strategy);

		assertThat(result, is(greaterThanOrEqualTo(0)));
	}

	@Test
	public void shouldScoreUsingStrategy() {

		Roll underTest = new Roll(1, 2, 3, 4, 5);
		final int expectedScore = 42;

		ScoringStrategy strategy = new ScoringStrategy() {
			@Override
			public int compute(int... rolls) {
				return expectedScore;
			}
		};

		int result = underTest.score(strategy);

		assertThat(result, is(expectedScore));
	}
}
