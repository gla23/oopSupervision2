package uk.ac.cam.gla23.oopjava.supervision2;

public class Supervision2Main {
	// Question 1
	// see other classes and the 2 diagrams

	// Question 2
	// 2 a
	// each section of the program is a module, for example department is
	// seperate to the other parts of the program, and if you wanted to change
	// how the products are stored that module can be edited without needing to
	// change department
	// 2 b
	// you could reuse a module in a different program. For example the employee
	// class could be copied and used in a payroll program
	// 2 c
	// The data in each class is encapsulated, it is only available within the
	// class unless you use a get/set method. For example you wouldnt be able to
	// set the product id to any random string as the method could be changed so
	// that it only accepts valid ids as strings.

	// Question 3
	// class - contains data values and methods
	public class ClassyClass {
		int i = 5;

		public void thing() {
			i += 1;
		}
	}

	// abstract class - can contain abstract methods and fields, which need to
	// be filled in by a class that extends it. This is not an interface because
	// it contains a non abstract field and method. This is
	// an advantage of using an abstract method as you can fill in a method
	// which will be used be all the children (here it is thing()).
	public abstract class AbstractClass {
		int i = 5;

		public void thing() {
			i += 1;
		}

		public abstract void thing2();
	}
	// interface - cannot contain non-abstract items. All classes which
	// implement an interface must define all the methods that are in the
	// interface
	/*
	 * This would be in a separate interface file package
	 * uk.ac.cam.gla23.oopjava.supervision2; public interface TestInterface {
	 * public void FillThisMethodMyChildren(); }
	 * 
	 */

	// Question 4
	// Dynamic Polymorphism - overriding
	// methods in a child class can override a method in a superclass so that
	// when the method is called the one defined in the child class in run.
	/*
	 * class Class1 { public void print() { System.out.println("1"); } }
	 * 
	 * class Class2 extends Class1 {public void print() {
	 * System.out.println("2"); } }
	 * 
	 * public class PrintTest {
	 * 
	 * public static void main(String args[]) { Class1 a = new Class1(); Class1
	 * b = new Class2();
	 * 
	 * a.print();// output: 1
	 * 
	 * b.print();// output: 2 } }
	 */

	// Question 5
	// classes in ninja subpackage, make a ninja interface although you still
	// have to copy the method body, but I cant see a way to get around this if
	// you dont want ninja to be an employee or vice versa

	// Question 6
	// When garbage collecting is run, the data stored in the heap is checked to
	// see if the program can get to it. If it can't it is removed from memory
	// after the finalizer is run. The problem with finalizers is that data
	// may not be consistently cleaned so they might not be run.

	// Question 7
	// If you change the string value that object is given when it is created.
	// For example you could define the toString used by Object when printing to
	// chnage what is printed:
	/*
	 * 
	 * @override public String toString() { return "some other output"; }
	 * 
	 */

	// Question 8
	// Can't this just be done in one object? I think we're only supposed to do
	// uml for inheritance and association links between classes.
	
	// Question 9
	// implementation of 1a

}
