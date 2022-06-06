public class StringCalculator {
	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",|\n";

		if (numbers.startsWith("//")) {
			delimiter = Character.toString(numbers.charAt(2));
			numbers = numbers.substring(4);
		}

		int sum = 0;
		for (var part : numbers.split(delimiter)) {
			sum += Integer.parseInt(part);
		}
		return sum;
	}
}
