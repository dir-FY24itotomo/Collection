package sample;

public class ArraySample {

	public static void main(String[] args) {
		var numbers = new int[5];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // Insert value to array[i]
        }

        // Display the factors
        for (var i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
	}
}
