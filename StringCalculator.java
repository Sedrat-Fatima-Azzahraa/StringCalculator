public class StringCalculator {
	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for (var part : numbers.split(",")) {
			sum += Integer.parseInt(part);
		}
		return sum;
	}
}
