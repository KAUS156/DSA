package OOPS;

public class Polymorphism2 {
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }


        public  static void main(String[] args) {
            Animal myCat = new Cat();
            Animal myDog = new Dog();

            myCat.sound();  // Output: Cat meows
            myDog.sound();  // Output: Dog barks
        }


}
