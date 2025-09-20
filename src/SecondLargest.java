public class SecondLargest {
    public static void main(String[] args) {
        int[] arr =  {14, 28, 19, 33, 45, 12};
        int i=0;
        int j=0;
        int max = 0;
        int temp;
        int secmax_out =0;
            for (i = 0; i < arr.length; i++) {
                temp = arr[i];
                if (temp > max) {
                    max = temp;
                }
            }
            //System.out.println(max);
        for (j = 0; j < arr.length; j++) {
            if (arr[j] < max && arr[j] != max && arr[j]> secmax_out) {
                secmax_out = arr[j];
            }
        }
            System.out.println("Second Largest Number "+secmax_out);
    }
}
