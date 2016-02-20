package org.btforsythe.yatzy;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class DieRollStream {

	public static DieRollStream stream(int... rolls) {
		return new DieRollStream(rolls);
	}

	private int[] rolls;

	public DieRollStream(int... rolls) {
		this.rolls = rolls;
	}

	public IntStream pairs() {
		return collectPairs().stream().mapToInt(Integer::intValue);
	}

	private Set<Integer> collectPairs() {
		return mapCounts().entrySet().stream().filter(e -> e.getValue() > 1).map(Entry::getKey).collect(toSet());
	}

	private Map<Integer, Integer> mapCounts() {
		return Arrays.stream(rolls).boxed()
				.collect(toMap(e -> e, e -> 1, (original, increment) -> original + increment));
	}
}
