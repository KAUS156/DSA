package OOPS;

abstract class Car{
    abstract void switchof();
     static void start(){
         System.out.println("hello");

    }
      abstract class thar extends Car{
         public void breck(){
             System.out.println("click break");
         }
    }
       public static class twayta extends Car{
         public void switchof(){
             System.out.println("press key");
         }
    }
    
}
