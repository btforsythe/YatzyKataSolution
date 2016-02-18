package org.btforsythe.yatzy;
import static org.btforsythe.yatzy.ScoreMatcher.hasScore;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChanceTest {

	@Test
	public void shouldBeSum() {
		Roll underTest = new Chance(1, 2, 3, 4, 5, 6);
		assertThat(underTest, hasScore(21));
	}
}
