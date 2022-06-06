public class StringCalculator {
	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		int commaIndex = numbers.indexOf(",");
		
		if (commaIndex == -1) {
			return Integer.parseInt(numbers);
		}

		String left = numbers.substring(0, commaIndex);
		String right = numbers.substring(commaIndex + 1);

		return Integer.parseInt(left) + Integer.parseInt(right);
	}
}
