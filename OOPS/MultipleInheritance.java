package OOPS;

public class MultipleInheritance {
    static class Student{
        void name(){

            System.out.println("Kaushal kumar");
        }
    }
    static class Btechstudent extends Student{
        void course(){

            System.out.println("B.tech student");
        }
    }
    static class centurion extends Btechstudent{
        static String place;



        public static void place(String f ){
            place=f;
        }
        void place(){
            
            System.out.println(place);
        }
    }

    public static void main(String[] args) {
        centurion h= new centurion();
        h.name();
        h.place="B.P.S High School Birpur";
        h.course();
        h.place();
    }
}
