public class LargestElement {
    public static void main(String[] args) {
        int[] a = {12,5,6,8,25,6};
        int max = a[0];
        for (int i = 1;i<a.length;i++){
            if (max<a[i]){
                max = a[i];
            }
        }
        System.out.println("The Largest Element is" +" " +max);
    }
}
