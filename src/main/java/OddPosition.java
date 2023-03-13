import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the Element");
        for (int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 1;i<a.length;i=i+2){
            System.out.println("Odd index"+i +" "+"Element"+a[i]);
        }

    }
}
