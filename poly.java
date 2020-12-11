/* Question 2
[Java Programming]
[20 Marks]

Inheritance and Polymorphism
Consider the following classes:
*/
public class Ponny extends Mammal {
	public void method1() {
		System.out.println ("Ponny 1"); 
	}
	public void method2() {
		System.out.println ("Ponny 2"); 
		super.method2(); 
	}
}
public class Creature {
	public void method2() {
		System.out.println ("Creature 2"); 
	}
}
public class  Horse extends Mammal {
	public void method1() { 
		System.out.println ("Horse 1");
	}
	public void method2() {
		System.out.println ("Horse 2");
	}
}
public class Mammal extends Creature {
	public void method2() {
		System.out.println ("Mammal 2"); 
	}
	public void method3() {
		method2();
		System.out.println ("Mammal 3"); 
	}
} 

/*The following variables are defined:*/
Mammal var1 = new Mammal(); 
Creature var2 = new Horse(); 
Mammal var3 = new Ponny(); 
Mammal var4 = new Horse(); 
Object var5 = new Mammal(); 
Creature var6 = new Creature();

/*
For each of the following lines/statements, indicate the output produced by the statement in the line below the statement. 
If the statement produces more than one line of output, write each line of output in a seprate line 
If the statement causes an error, write the phrase ”error” to indicate this.


NOTE that this is a code snippet and not a complete java program; hence, you do not need to compile or run it
*/
		var1.method2();
		//answer:
		//Mammal 2

		var2.method2();
		//answer:
		//Horse 2

		var3.method2();
		//answer:
		//Ponny 2
		//Mammal 2

		var4.method2();
		//answer:
		//Horse 2

		var5.method2();
		//answer:
		//error

		var6.method2();
		//answer: 
		//Creature 2
		
		var1.method3();
		//answer: 
		//Mammal 2 
		//Mammel 3

		var2.method3();
		//answer: 
		//error

		var3.method3();
		//answer:
		//Ponny 2
		//Mammal 2
		//Mammal 3

		var4.method3();
		//answer: 
		//Horse 2
		//Mammal 3

		((Ponny) var1).method1();
		//answer:
		//error

		((Horse) var2).method1();
		//answer:
		//Horse 1
		
		((Ponny) var3).method1();
		//answer:
		//Ponny 1
		
		((Ponny) var4).method1();
		//answer:
		//error
		
		((Horse) var4).method2();
		//answer:
		//Horse 2

		((Mammal) var5).method2();
		//answer:
		//Mammal 2

		((Creature) var5).method3();
		//answer: error

		((Horse) var2).method3();
		//answer:
		// Horse 2
		//Mammal 3

		((Ponny) var3).method3();
		//answer:
		//Ponny 2
		//Mammal 2
		//Mammal 3

		((Ponny) var5).method3();
		//answer:
		//error
