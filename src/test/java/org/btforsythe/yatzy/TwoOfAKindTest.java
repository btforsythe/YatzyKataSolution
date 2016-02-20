package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TwoOfAKindTest {

	@Test
	public void shouldScoreZero() {

		ScoringStrategy underTest = ScoringStrategies.twoOfAKind();

		int result = underTest.compute(1, 2, 3, 4, 5);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScorePairOfThrees() {

		ScoringStrategy underTest = ScoringStrategies.twoOfAKind();

		int result = underTest.compute(1, 2, 3, 4, 3);

		assertThat(result, is(3 + 3));
	}
}
