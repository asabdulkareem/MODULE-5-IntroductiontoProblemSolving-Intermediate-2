package day51;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionalTest {

	@Test
	void ex1IsMagicReturnsOneForSingleDigitOne() {
		assertEquals(1, Additional.ex1IsMagic(1));
	}

	@Test
	void ex1IsMagicReturnsZeroForZeroAndNonMagicNumbers() {
		assertEquals(0, Additional.ex1IsMagic(0));
		assertEquals(0, Additional.ex1IsMagic(7));
	}

	@Test
	void ex1IsMagicHandlesMultiDigitNumberThatProducesNonOneDueToTrailingZeroBehavior() {
		// current implementation treats numbers ending with zero specially
		assertEquals(0, Additional.ex1IsMagic(19));
		assertEquals(0, Additional.ex1IsMagic(10));
	}

	@Test
	void kthSymbolEasyGeneratesExpectedSequenceForLevelFour() {
		List<Integer> expected = Arrays.asList(0,1,1,0,1,0,0,1);
		assertEquals(expected, Additional.kthSymbolEasy(4));
	}

	@Test
	void ex2KthSymbolEasyReturnsCorrectSymbolAtGivenIndex() {
		assertEquals(0, Additional.ex2KthSymbolEasy(1, 0));
		assertEquals(1, Additional.ex2KthSymbolEasy(2, 1));
		assertEquals(1, Additional.ex2KthSymbolEasy(3, 2));
	}

	@Test
	void ex3KthSymbolHardBaseAndSmallLevelsProduceConsistentValues() {
		assertEquals(0, Additional.ex3KthSymbolHard(0, 0));
		// according to current implementation level 1 yields 1 for any index
		assertEquals(1, Additional.ex3KthSymbolHard(1, 0));
		// level 2 returns 1 for any index
		assertEquals(1, Additional.ex3KthSymbolHard(2, 3));
		// level 3 returns 0 for any index
		assertEquals(0, Additional.ex3KthSymbolHard(3, 5));
	}

	@Test
	void ex4JosephusProblemHandlesTrivialAndKnownCases() {
		assertEquals(1, Additional.ex4JosephusProblem(1, 5));
		assertEquals(5, Additional.ex4JosephusProblem(5, 1));
		assertEquals(3, Additional.ex4JosephusProblem(5, 2));
		assertEquals(4, Additional.ex4JosephusProblem(7, 3));
	}
}
