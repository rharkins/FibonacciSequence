package FibonacciSequence;

public class FibonacciSequenceLauncher {

	public static void main(String[] args) 
	{
		// Create a new FibonacciSequence object
		FibonacciSequence myFibonacciSequence = new FibonacciSequence();
		// Define the integer array of potential Fibonacci numbers 
		int[] PotentialFibonacciNumbers = {0,1,0,2,0,3,14,3};
		// Call the NumberValidator method, passing the array of integers to be validated
		myFibonacciSequence.NumberValidator(PotentialFibonacciNumbers);
	}
}
