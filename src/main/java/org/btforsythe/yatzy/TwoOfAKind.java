package org.btforsythe.yatzy;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwoOfAKind implements ScoringStrategy {

	@Override
	public int compute(int... rolls) {
		int highestPair = pairs(rolls).stream().mapToInt(Integer::intValue).max().orElse(0);

		return highestPair * 2;
	}

	private Set<Integer> pairs(int... rolls) {
		return mapCounts(rolls).entrySet().stream().filter(e -> e.getValue() > 1).map(Entry::getKey).collect(toSet());
	}

	private Map<Integer, Integer> mapCounts(int... rolls) {
		return stream(rolls).boxed().collect(toMap(e -> e, e -> 1, (original, increment) -> original + increment));
	}
}
