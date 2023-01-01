class Main {
	public static void main(String[] args) {
		// Aritmetic Operators
		int a = 5, b = 6;
		System.out.println("A(" + a + ") + B("+ b +") = "+ (a+b));	
		System.out.println("A(" + a + ") - B("+ b +") = "+ (a-b));
		System.out.println("A(" + a + ") * B("+ b +") = "+ (a*b));
		System.out.println("A(" + a + ") / B("+ b +") = "+ (a/b));
		System.out.println("A(" + a + ") + B("+ b +") = "+ (a%b));

		// Assignment Operator
		int c = 4;
		int var; // System detect type 
		var = a;
		System.out.println("Var using =: " + var);
		var += a;
		System.out.println("Var using +=: " + var);
		var *=a;
		System.out.println("Var using *=: " + var);

		// Relational Operator
		int d = 7, e = 11;
		System.out.println("d: " + d + " e: " + e);
		System.out.println("D == E? "+ (d==e));
		System.out.println("D != E? "+ (d!=e));
		System.out.println("D > E? "+ (d>e));
		System.out.println("D < E? "+ (d<e));
		System.out.println("D >= E? "+ (d>=e));
		System.out.println("D <= E? "+ (d<=e));

		// Logical Operator
		System.out.println((5 > 3) && (8 > 5));
		System.out.println((5 > 3) || (8 > 5));
		System.out.println(!(5 > 3));
		
		// Unary Operator
		int f = 5, result1, result2;
		System.out.println("Value of f: " + f);
		result1 = ++f;
		System.out.println("After increment: " + result1);
		result2 = --f;
		System.out.println("After decrement: " + result2);

		// Bitwise Operator
		int binary = 0b111;
		System.out.println("~ of "+ binary+ "is " + ~binary);
		System.out.println("<< of "+ binary+ "shifted 2 is " + (binary << 2));
		System.out.println(">> of "+ binary+ "shifted 2 is " + (binary >> 2));
		System.out.println(">>> of "+ binary+ "shifted 2 is " + (binary >>> 2));
		System.out.println("& of "+ binary+ "of 2 is " + (binary & 2));
		System.out.println("^ of "+ binary+ "of 2 is " + (binary ^ 2));

		// Instanceof Operator check type operator
		String myString = "Yes Sirr";
		boolean result = myString instanceof String;
		System.out.println("Is my string is object of string? "+ result);

		
	}

}
