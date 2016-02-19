package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChanceTest {

	@Test
	public void shouldComputeAScore() {
		
		ScoringStrategy underTest = new Chance();
		
		int result = underTest.compute();
		
		assertThat(result, is(greaterThanOrEqualTo(0)));
	}
	
	@Test
	public void shouldComputeSimpleScore() {
		
		ScoringStrategy underTest = new Chance();
		
		int dieRoll = 42;
		int result = underTest.compute(dieRoll);
		
		assertThat(result, is(dieRoll));
	}
}
