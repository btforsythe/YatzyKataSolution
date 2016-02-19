package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChanceTest {
	
	@Test
	public void shouldComputeScore() {
		
		ScoringStrategy underTest = ScoringStrategies.chance();
		
		int result = underTest.compute();
		
		assertThat(result, is(greaterThanOrEqualTo(0)));
	}
}
