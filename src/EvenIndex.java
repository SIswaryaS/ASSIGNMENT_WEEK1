public class EvenIndex {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60};
        int i=0;
        for (i=0; i<arr.length; i++){
            if (i%2==0) {
                System.out.print(arr[i] +" ");
            }
        }
    }
}
