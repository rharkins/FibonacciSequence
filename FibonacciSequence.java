package FibonacciSequence;

public class FibonacciSequence {

	public void NumberValidator(int[] IntegerArray)
	{
		int FibonacciElement1 = 0;
		int FibonacciElement2 = 1;
		int FibonacciNumber = 0;
		
		// This is the start of the Outer Loop.  Each iteration through this loop represents the next item in the integer array
		for (int OuterLoop=0; OuterLoop<IntegerArray.length; OuterLoop++)
		{
			// Check if the integer value = 0
			if (IntegerArray[OuterLoop]==0)
			{
				// Print out that the value '0' is a Fibonacci number
				System.out.println("Array Element " + OuterLoop + " = " + IntegerArray[OuterLoop] + " and is a Fibonacci number");
				// The continue statement sends control to the end of the Outer Loop and iterates the OuterLoop variable
				continue;
			}
			// Check if the integer value = 1
			if (IntegerArray[OuterLoop]==1)
			{
				// Print out that the value '1' is a Fibonacci number
				System.out.println("Array Element " + OuterLoop + " = " + IntegerArray[OuterLoop] + " and is a Fibonacci number");
				// The continue statement sends control to the end of the Outer Loop and iterates the OuterLoop variable
				continue;
			}
			// This is the start of the Inner Loop.  The iterations of this loop generate the next number in the Fibonacci sequence
			for (int InnerLoop = 0; InnerLoop<=IntegerArray[OuterLoop]; InnerLoop++)
			{
				// Calculate the Fibonacci number
				FibonacciNumber = FibonacciElement1 + FibonacciElement2;
				// Check if the Fibonacci number equals the integer we are validating
				if (IntegerArray[OuterLoop] == FibonacciNumber)
				{
					// Print out the index of the integer array element and that the integer we are validating is a Fibonacci number
					System.out.println("Array Element " + OuterLoop + " = " + IntegerArray[OuterLoop] + " and is a Fibonacci number");
					// Set first Fibonacci number back to 0 to prepare for processing the next array element
					FibonacciElement1 = 0;
					// Set second Fibonacci number back to 1 to prepare for processing the next array element
					FibonacciElement2 = 1;
					// Break out of Inner Loop - start processing next array element in the Outer Loop
					break;
				}
				// Check if the Fibonacci number is greater than the integer we are validating
				else if (FibonacciNumber > IntegerArray[OuterLoop])
				{
					// Print out the index of the integer array element and that the integer we are validating is not a Fibonacci number
					System.out.println("Array Element " + OuterLoop + " = " + IntegerArray[OuterLoop] + " and is not a Fibonacci number");
					// Set first Fibonacci number back to 0 to prepare for processing the next array element
					FibonacciElement1 = 0;
					// Set second Fibonacci number back to 1 to prepare for processing the next array element
					FibonacciElement2 = 1;
					// Break out of Inner Loop - start processing next array element in the Outer Loop
					break;
				}
				else
				{
					// Increment FibonacciElement2 - representing the second most recent Fibonacci number in the sequence
					FibonacciElement2 = FibonacciElement1;
					// Increment FibonacciElement1 - representing the most recent Fibonacci number in the sequence
					FibonacciElement1 = FibonacciNumber;
				}
			}
		}
	}
}
