/**
 * First demonstration of initializer blocks in Java. Note the code
 * in curly braces that is not part of any method or constructor. We
 * can run to see when each gets executed relative to other, more
 * familiar, parts of the code.
 * 
 * @author Darren Lim (code based on his Order.java)
 * @author Jim Teresco
 * @version Spring 2022
 */

public class Initializers {

    // look, code not in any method! An initializer block.
    {
        System.out.println("First defined initializer block");
    }

    public Initializers() {

        System.out.println("Zero argument constructor");
    }

    public static void main(String[] args) {

        System.out.println("Beginning of main");
        Initializers o = new Initializers();
        o.print();
    }

    // another initializer block
    {
        System.out.println("Second defined initializer block");
    }

    public void print() {

        System.out.println("print method");
    }

}
