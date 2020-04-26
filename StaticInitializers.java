/**
   Second demonstration of initializer blocks in Java, this one
   including static initializers.  We can run to see when each gets
   executed relative to other, more familiar parts of the code.
 
   @author Darren Lim (code based on his Order2.java)
   @author Jim Teresco
   @version Spring 2020
*/

public class StaticInitializers {

    // an initializer block
    {
        System.out.println("First defined initializer block");
    }

    public StaticInitializers() {
	
        System.out.println("Zero argument constructor");
    }

    public static void main(String[] args) {
	
        System.out.println("Beginning of main");
	
	System.out.println("About to construct using the default constructor");
        StaticInitializers o = new StaticInitializers();
	System.out.println("About to call the instance method print");
        o.print();
	
        System.out.println("About to construct using the int constructor");
        StaticInitializers o2 = new StaticInitializers(1);
	
        System.out.println("About to construct using the String constructor");
        StaticInitializers o3 = new StaticInitializers("1");
    }

    // another initializer block, this one denoted as static
    static
    {
        System.out.println("First defined static initializer block");
    }

    public StaticInitializers(String x) {
	
        this();
        System.out.println("String argument constructor (after calling default constructor)");
    }

    // a second instance initializer block
    {
        System.out.println("Second defined initializer block");
    }

    public void print() {
	
        System.out.println("print method");
    }

    // a second static initializer block
    static
    {
        System.out.println("Second defined static initializer block");
    }

    public StaticInitializers(int x) {
	
        System.out.println("int argument constructor (did NOT call default constructor)");
    }
}
