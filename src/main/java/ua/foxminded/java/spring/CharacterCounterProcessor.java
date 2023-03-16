package ua.foxminded.java.spring;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCounterProcessor {

	private Map<String, String> cache = new LinkedHashMap<>();

	public String characterCounterProcessor(String input) {
		ViewСountedСharacters view = new ViewСountedСharacters();
		if (input == null || input.equals("") || input.matches("\\s+")) {
			throw new IllegalArgumentException("Text should can not be empty");
		}

		if (cache.containsKey(input)) {
			return cache.get(input);
		}

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		String result = view.viewСountedСharacters(map);
		cache.put(input, result);
		return result;
	}
}