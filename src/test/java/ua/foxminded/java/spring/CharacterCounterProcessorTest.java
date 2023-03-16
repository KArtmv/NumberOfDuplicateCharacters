package ua.foxminded.java.spring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


class CharacterCounterProcessorTest {
	CharacterCounterProcessor duplicateCharacter = new CharacterCounterProcessor();

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "  " })
	void CharacterCounterProcessor_shouldReturnIllegalArgumentException_whenInputNullOrEmptyOrSpace(String input) {
		assertThrows(IllegalArgumentException.class, () -> duplicateCharacter.characterCounterProcessor(input));
	}
	
	@Test
	void CharacterCounterProcessor_shouldReturnNumbertOfDuplicateCharacter() {
		String expected = "\"H\" - 1\n" +
			"\"e\" - 1\n" +
			"\"l\" - 3\n" +
			"\"o\" - 2\n" +
			"\" \" - 1\n" +
			"\"w\" - 1\n" +
			"\"r\" - 1\n" +
			"\"d\" - 1\n" +
			"\"!\" - 1\n";
		assertEquals(expected, duplicateCharacter.characterCounterProcessor("Hello world!"));
	}
}
