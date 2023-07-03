package com.goit.fry;

public class SumCalculator {

    public int sum(int n) {

		if(n <= 0)
			throw new IllegalArgumentException("the argument have to be > 0: " + n);

		return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

	if (args.length != 1) {
		System.err.println("The parameter N is missing");
		return;
	}

	int N;
	try {
		N = Integer.parseInt(args[0]);
	}
	catch (NumberFormatException e) {

		System.err.println("The parameter is not an integer");
		return;
	}

	SumCalculator calc = new SumCalculator();
	int s = calc.sum(N);
	System.out.println("N = " + N);
	System.out.println("sum = " + s);
    }
}
