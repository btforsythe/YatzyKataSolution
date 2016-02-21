package org.btforsythe.yatzy;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class DieRollsParser {

	public static DieRollsParser parse(int... rolls) {
		return new DieRollsParser(rolls);
	}

	private int[] rolls;

	public DieRollsParser(int... rolls) {
		this.rolls = rolls;
	}

	public IntStream pairs() {
		return collectGroupsContainingAtLeast(2).stream().mapToInt(Integer::intValue);
	}

	private Set<Integer> collectGroupsContainingAtLeast(int groupSize) {
		return mapCounts().entrySet().stream().filter(e -> e.getValue() >= groupSize).map(Entry::getKey)
				.collect(toSet());
	}

	public int fourOfAKind() {
		return collectGroupsContainingAtLeast(4).stream().findFirst().orElse(0);
	}

	private Map<Integer, Integer> mapCounts() {
		return Arrays.stream(rolls).boxed()
				.collect(toMap(e -> e, e -> 1, (original, increment) -> original + increment));
	}

	public int countWithPips(int pips) {
		return mapCounts().getOrDefault(pips, 0);
	}
}
