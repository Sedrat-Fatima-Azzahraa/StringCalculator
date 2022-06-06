import java.util.Vector;

public class StringCalculator {
	int Add(String numbers) throws Exception{
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",|\n";

		if (numbers.startsWith("//")) {
			delimiter = Character.toString(numbers.charAt(2));
			numbers = numbers.substring(4);
		}

		Vector<Integer> negativeNumbers = new Vector<Integer>();

		int sum = 0;
		for (var part : numbers.split(delimiter)) {
			int value = Integer.parseInt(part);
			if (value < 0) {
				negativeNumbers.add(value);
			}
			sum += value;
		}

		if (!negativeNumbers.isEmpty()) {
			String[] arr = new String[negativeNumbers.size()];
			for (int i = 0 ; i < arr.length ; i++) {
				arr[i] = negativeNumbers.get(i).toString();
			}
			throw new Exception("negatives not allowed: " + String.join(", ", arr) + ".");
		}

		return sum;
	}
}
