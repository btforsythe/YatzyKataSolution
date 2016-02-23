package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SmallStraightTest {

	@Test
	public void shouldScoreZero() {

		ScoringStrategy underTest = ScoringStrategies.smallStraight();

		int result = underTest.compute(2, 3, 6, 1, 5);

		assertThat(result, is(0));
	}
	
	@Test public void shouldScoreSortedSmallStraight() {
		
		ScoringStrategy underTest = ScoringStrategies.smallStraight();

		int result = underTest.compute(1, 2, 3, 4, 5);

		assertThat(result, is(15));
	}
}
