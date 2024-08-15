package OOPS;

public class Constructor {
    private  String name ;

    private  int age ;
    private  int id ;
    public  Constructor(String a,int b,int c){
        name=a;
        age =b;
        id =c;

    }
    void get(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Constructor f= new Constructor("Kuasha",2,20);
        f.get();
    }
}
