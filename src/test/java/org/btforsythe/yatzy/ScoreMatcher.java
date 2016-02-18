package org.btforsythe.yatzy;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class ScoreMatcher extends TypeSafeMatcher<Roll> {

	public static Matcher<Roll> hasScore(int expected) {
		return new ScoreMatcher(expected);
	}
	
	private int expected;

	public ScoreMatcher(int expected) {
		this.expected = expected;
	}
	
	@Override
	public void describeTo(Description description) {
		description.appendText("score to be " + expected);
	}

	@Override
	protected void describeMismatchSafely(Roll roll, Description mismatchDescription) {
		mismatchDescription.appendText("score is " + roll.score());
	}

	@Override
	protected boolean matchesSafely(Roll roll) {
		return expected == roll.score();
	}
}