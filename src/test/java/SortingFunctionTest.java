import com.nexsoft.sorting.CSorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SortingFunctionTest {

	CSorting cs = new CSorting();

	@DisplayName("Bubble Sort Test")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)

	public void test1_Bubble_Sort_Test(int a, int b, int c, int d, int e) {
		// arrange

		int number[] = { a, b, c, d, e };
		int expected[] = { a, b, c, d, e };

		// act

		Arrays.sort(expected);
		cs.bubbleSort(number, number.length);

		// assert
		assertArrayEquals(expected, number);

	}

	@DisplayName("Selection Sort Test")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)

	public void test2_Selection_Sort_Test(int a, int b, int c, int d, int e) {
		// arrange

		int number[] = { a, b, c, d, e };
		int expected[] = { a, b, c, d, e };

		// act

		Arrays.sort(expected);
		cs.selectionSort(number);

		// assert
		assertArrayEquals(expected, number);

	}

	@DisplayName("Insertion Sort Test")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)

	public void test3_insertion_Sort_Test(int a, int b, int c, int d, int e) {
		// arrange

		int number[] = { a, b, c, d, e };
		int expected[] = { a, b, c, d, e };

		// act

		Arrays.sort(expected);
		cs.insertionSort(number, number.length);

		// assert
		assertArrayEquals(expected, number);

	}

	@DisplayName("Duration 500ms Test")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)

	public void test4_Duration_500_ms_Selection_Sort_Test(int a, int b, int c, int d, int e) {

		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange

			int number[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };

			// act

			Arrays.sort(expected);
			cs.selectionSort(number);

			// assert
			assertArrayEquals(expected, number);

		});

	}
	@DisplayName("Duration 500ms Test")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)

	public void test5_Duration_500_ms_Bubble_Sort_Test(int a, int b, int c, int d, int e) {

		assertTimeout(Duration.ofMillis(500), () -> {
			// arrange

			int number[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };

			// act

			Arrays.sort(expected);
			cs.bubbleSort(number, number.length);

			// assert
			assertArrayEquals(expected, number);

		});

	}

}
