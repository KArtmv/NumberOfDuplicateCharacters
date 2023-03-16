package ua.foxminded.java.spring;

import java.util.Map;

public class ViewСountedСharacters {

	public String viewСountedСharacters(Map<Character, Integer> map) {
		StringBuilder result = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			result.append("\"" + entry.getKey() + "\" - " + entry.getValue() + "\n");
		}

		return result.toString();

	}
}
