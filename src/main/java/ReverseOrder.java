import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element ");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are :");
        for (int i = 0;i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("reverse element");
        for (int i =a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

}
