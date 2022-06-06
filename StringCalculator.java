public class StringCalculator {
	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		if (numbers.indexOf(",") == -1) {
			return Integer.parseInt(numbers);
		}
		String left = numbers.substring(0, numbers.indexOf(","));
		String right = numbers.substring(numbers.indexOf(",") + 1);

		return Integer.parseInt(left) + Integer.parseInt(right);
	}
}
