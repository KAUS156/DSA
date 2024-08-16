package OOPS;
public class Thiskeyword {
    int x;
    int y;

    // Constructor that uses 'this' to differentiate between the instance variable and the parameter
    public Thiskeyword(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor that calls another constructor using 'this()'
    public Thiskeyword(int x) {
        this(x, 0); // Calls the constructor with two parameters
    }

    // Method that returns the current object using 'this'
    public Thiskeyword setX(int x) {
        this.x = x;
        return this; // Returns the current object
    }

    // Method that passes the current object using 'this'
    public void display() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    // Method that calls another method using 'this'
    public void show() {
        this.display(); // Equivalent to calling display() directly
    }

    public static void main(String[] args) {
        // Creating an object using the constructor with two parameters
        Thiskeyword example1 = new Thiskeyword(10, 20);
        example1.display();  // Outputs: x = 10, y = 20

        // Creating an object using the constructor with one parameter
        Thiskeyword example2 = new Thiskeyword(30);
        example2.display();  // Outputs: x = 30, y = 0

        // Modifying object using 'setX' method
        example2.setX(40).display();  // Outputs: x = 40, y = 0

        // Calling a method that internally uses 'this' to call another method
        example2.show();  // Outputs: x = 40, y = 0
    }
}
