public class EvenPosition {
    public static void main(String[] args) {
        int[] a = {10,5,8,7,9};
        for (int i  = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Even position of Element");
        for (int i  = 2;i<a.length;i=i+2){
            System.out.println("index"+i +" "+"Element"+a[i]);
            }
        }

    }

