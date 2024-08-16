package OOPS;

public class SingleInheritance {
    // Superclass
    static  class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Subclass
    static  class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }

}