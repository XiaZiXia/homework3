package h3;

public class h3 {
	
	private static  String str = new String("");
	
	public  String Getstr(){
		return str;
	}

	public void printPrimes (int n)
	{
		int curPrime; // Value currently considered for primeness
		int numPrimes; // Number of primes found so far.
		boolean isPrime; // Is curPrime prime?
		int [] primes = new int [100]; // The list of prime numbers.
	 
		// Initialize 2 into the list of primes.
		primes [0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while (numPrimes < n)
		{
			curPrime++; // next number to consider ...
			isPrime = true;
			for (int i = 0; i <= numPrimes-1; i++)
			{ // for each previous prime.
				if (isDivisible (primes[i], curPrime))
				{ // Found a divisor, curPrime is not prime.
					isPrime = false;
					break; // out of loop through primes.
				}
			}
			if (isPrime)
			{ // save it!
				primes[numPrimes] = curPrime;
				numPrimes++;
			}
		} // End while
	 
		// Print all the primes out.
		for (int i = 0; i <= numPrimes-1; i++)
		{
			System.out.println ("Prime: " + primes[i]);
			str=str+"Prime: " + primes[i] +"\r\n";
		}
	} // end printPrimes

	private static boolean isDivisible(int a, int b) {
		// TODO �Զ����ɵķ������
		if(b%a==0)
			return true;
		return false;
	}
 
}
