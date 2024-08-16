package OOPS;

public class Methodoverride {
  public static class Animal {
       void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
       void sound() {
            System.out.println("Dog barks");
        }
    }
        public static void main(String[] args) {
            Animal myAnimal = new Dog();
            myAnimal.sound();
        }
    }
