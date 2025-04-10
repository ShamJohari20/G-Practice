public class Sample {

    public static void main(String[] args) {
        // Print a simple greeting to the console.
        System.out.println("Hello, World!");

	// Perform a basic arithmetic operation.
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;

        // Print the result of the addition.
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	
	// Example of an if-else statement.
        if (sum > 10) {
            System.out.println("The sum is greater than 10.");
        } else {
            System.out.println("The sum is not greater than 10.");
        }

	 // Example of a for loop.
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
	
	//Example of an array.
        int[] numbers = {1,2,3,4,5};
        System.out.println("Printing the elements of the array:");
        for(int number : numbers) {
            System.out.println(number);
        }

    }
}

