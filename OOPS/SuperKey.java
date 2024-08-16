package OOPS;

public class SuperKey {
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog is eating");
        }

        void displayEating() {
             super.eat();  // Calls the eat() method from the Animal class
            eat();        // Calls the eat() method from the Dog class
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.displayEating();
        }
    }

}
