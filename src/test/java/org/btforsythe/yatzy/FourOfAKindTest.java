package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FourOfAKindTest {

	@Test
	public void shouldScoreZero() {

		ScoringStrategy underTest = ScoringStrategies.fourOfAKind();

		int result = underTest.compute(1, 1, 1, 2, 2);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScore6s() {

		ScoringStrategy underTest = ScoringStrategies.fourOfAKind();

		int result = underTest.compute(6, 6, 6, 6, 2);

		assertThat(result, is(6 * 4));
	}

	@Test
	public void shouldScore5sWhenThereAreMoreThan4() {

		ScoringStrategy underTest = ScoringStrategies.fourOfAKind();

		int result = underTest.compute(5, 5, 5, 5, 5);

		assertThat(result, is(5 * 4));
	}
}
