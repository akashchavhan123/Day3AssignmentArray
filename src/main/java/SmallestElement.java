import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        int[] a  = new int[5];
        int min = a[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element");
        for (int i = 0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are");
        for (int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        for (int i = 1;i<a.length;i++){
            if (a[i]<min){
                min = a[i];

            }

        } System.out.println("Smallest element is"+min);

    }
}
