package ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        int arr[]= new int [5];
        try {
            System.out.println(arr[8]);
        }
        catch (Exception e){
            System.out.println("Can you this exception");
        }

        System.out.println("Hello kaushal");
    }
}
