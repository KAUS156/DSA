public class Encapsulation {
    private  String name;
    private  String place;
    private  int age;
    public void tu(String a ,String b,int s) {
        name= a;
         place =b;
        age =s;
    }
        public void mt() {
            System.out.println(age);
            System.out.println(place);
            System.out.println(name);
        }

    public static void main(String[] args) {
        Encapsulation t= new Encapsulation();
            t.tu("KAUSHAL","SARAUNJA",20);
            t.mt();
        }


}
