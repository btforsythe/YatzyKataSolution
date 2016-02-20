package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SameNumberOfPipsTest {

	@Test
	public void shouldScoreZero() {

		ScoringStrategy underTest = ScoringStrategies.diceWithPips(1);

		int result = underTest.compute(2, 3, 4, 5, 6);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScoreTwos() {

		ScoringStrategy underTest = ScoringStrategies.diceWithPips(2);

		int result = underTest.compute(2, 3, 4, 5, 6);

		assertThat(result, is(2));
	}

	@Test
	public void shouldScoreFours() {

		ScoringStrategy underTest = ScoringStrategies.diceWithPips(4);

		int result = underTest.compute(2, 3, 4, 5, 4);

		assertThat(result, is(4 + 4));
	}
}
