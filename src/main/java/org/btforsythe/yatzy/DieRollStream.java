package org.btforsythe.yatzy;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DieRollStream {

	private int[] rolls;

	public DieRollStream(int... rolls) {
		this.rolls = rolls;
	}

	public Set<Integer> pairs() {
		return mapCounts().entrySet().stream().filter(e -> e.getValue() > 1).map(Entry::getKey).collect(toSet());
	}

	private Map<Integer, Integer> mapCounts() {
		return stream(this.rolls).boxed().collect(toMap(e -> e, e -> 1, (original, increment) -> original + increment));
	}
}
