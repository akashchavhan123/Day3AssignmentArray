import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        for (int i = 0;i<a.length;i++){
             a[i] = a[i];
        }
        System.out.println("elements are");
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Reverse Element");
        for (int i = a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}