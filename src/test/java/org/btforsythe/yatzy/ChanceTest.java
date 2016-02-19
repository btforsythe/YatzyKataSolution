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
		underTest = ScoringStrategies.chance();		
	}
	
	@Test
	public void shouldComputeScore() {

		int result = underTest.compute();

		assertThat(result, is(greaterThanOrEqualTo(0)));
	}

	@Test
	public void shouldComputeSimpleScore() {

		int result = underTest.compute(86);

		assertThat(result, is(86));
	}

	@Test
	public void shouldComputeSumOfSeveral() {

		int[] rollsSummingTo42 = { 23, 10, 9 };
		int result = underTest.compute(rollsSummingTo42);

		assertThat(result, is(42));
	}
}
