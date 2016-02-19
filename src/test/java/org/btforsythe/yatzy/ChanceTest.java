package org.btforsythe.yatzy;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChanceTest {

	private ScoringStrategy underTest;

	@Before
	public void setup() {
		underTest = new Chance();		
	}
	
	@Test
	public void shouldComputeAScore() {
		
		int result = underTest.compute();
		
		assertThat(result, is(greaterThanOrEqualTo(0)));
	}
	
	@Test
	public void shouldComputeSimpleScore() {
		
		int dieRoll = 42;
		int result = underTest.compute(dieRoll);
		
		assertThat(result, is(dieRoll));
	}
	
	@Test
	public void shouldComputeScoreAsSum() {
		
		int[] dieRollsSummingTo6 = {1, 2, 3};
		int result = underTest.compute(dieRollsSummingTo6);
		
		assertThat(result, is(6));
	}
}
