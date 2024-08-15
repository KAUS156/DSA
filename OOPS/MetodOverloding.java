package OOPS;

public class MetodOverloding {
    public int st(int a,int b){
       int c=a+b;
        return c;

    }
    public String st(String s, String o){
         String l=s+o;
        return l;

    }

    public static void main(String[] args) {
        MetodOverloding f= new MetodOverloding();
        System.out.println(f.st(2,7));
        System.out.println(f.st("Kaushal","Kumar"));

    }
}
