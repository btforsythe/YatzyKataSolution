package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class YatzyTest {

	@Test
	public void shouldScoreZero() {

		ScoringStrategy underTest = ScoringStrategies.yatzy();

		int result = underTest.compute(1, 2, 3, 4, 5);

		assertThat(result, is(0));
	}

}
