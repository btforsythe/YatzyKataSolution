package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FourOfAKindTest {

	private ScoringStrategy underTest;

	@Before
	public void setup() {
		underTest = ScoringStrategies.fourOfAKind();
	}

	@Test
	public void shouldScoreZero() {

		int result = underTest.compute(1, 1, 1, 2, 2);

		assertThat(result, is(0));
	}

	@Test
	public void shouldScore6s() {

		int result = underTest.compute(6, 6, 6, 6, 2);

		assertThat(result, is(6 * 4));
	}

	@Test
	public void shouldScore5sWhenThereAreMoreThan4() {

		int result = underTest.compute(5, 5, 5, 5, 5);

		assertThat(result, is(5 * 4));
	}
}
