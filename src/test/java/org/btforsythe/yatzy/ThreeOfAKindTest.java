package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ThreeOfAKindTest {

	@Test
	public void shouldScoreZero() {
		ScoringStrategy underTest = ScoringStrategies.threeOfAKind();

		int result = underTest.compute(1, 1, 2, 2, 3);

		assertThat(result, is(0));
	}
}
