package OOPS;

public class Ploymorphism1 {

    public int add (int a,int b){
int c=a+b;
return c;

    }
    public double add (double a,double b){
        double c=a+b;
        return c;

    }
    public String add (String a,String b){
        String c=a+b;
        return c;

    }

    public static void main(String[] args) {
        Ploymorphism1 f= new Ploymorphism1();

        System.out.println(f.add(3,6));
        System.out.println(f.add(3.7,6.8));
        System.out.println(f.add("kaushal","kumar"));
    }

}
