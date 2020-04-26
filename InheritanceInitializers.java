/**
   Third demonstration of initializer blocks in Java, this one
   including static initializers and inhertiance.  We can run to see
   when each gets executed relative to other, more familiar parts of
   the code.
 
   @author Darren Lim (code based on his Order3.java)
   @author Jim Teresco
   @version Spring 2020
*/

class SuperClass {
    
    // an instance initializer block for the superclass
    {
        System.out.println("SuperClass instance first initializer block");
	// we can't do this yet: System.out.println("x = " + x);
    }

    // an instance variable with inline initialization
    public int x = 6;

    // another instance initializer block for the superclass
    {
        System.out.println("SuperClass instance second initializer block");
	System.out.println("x = " + x);
    }

    // a static initializer block for the superclass
    static
    {
        System.out.println("SuperClass static initializer block");
    }
    
    public SuperClass() {
	
        System.out.println("SuperClass zero-argument constructor");
    }
    
    public SuperClass(int x) {
	
        this.x = x;
        System.out.println("SuperClass int constructor");
    }
}

public class InheritanceInitializers extends SuperClass {
    
    //private int x = 5;
 
    // an instance initializer block for the derived class
    {
        System.out.println("InheritanceInitializers initializer block");
        System.out.println("x = " + x);
    }

    public InheritanceInitializers() {
	
        super(4);
        System.out.println("InheritanceInitializers zero argument constructor (after calling superclass int constructor)");
    }
    
    public static void main(String args[]) {
	
        System.out.println("Beginning of main");
	System.out.println("About to call String parameter InheritanceInitializers constructor");
        InheritanceInitializers o = new InheritanceInitializers("Hello");
	
	System.out.println("About to call print method");
        o.print();
    }

    // a static initializer block for the derived class
    static
    {
        System.out.println("InheritanceInitializers static initializer block");
    }
    
    public InheritanceInitializers(String x) {
	
        this();
        System.out.println("InheritanceInitializers String argument constructor (after calling default constructor)");
    }
        
    public void print() {
	
        System.out.println("print method");
    }
}
