public class CountNumArray {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 12, -9, 0, 7};
        //int i = 0;
        int count=0;
        int count1=0;
        int count2 =0;
        int i;
        for(i=0; i<arr.length; i++){
            if (arr[i]<0) {
                count += 1;
            }
            else if (arr[i]>0) {
                count1 += 1;
            }
            else if (arr[i]==0) {
                count2 += 1;
            }
        }
        System.out.println("Negative values count= "+count);
        System.out.println("Positive values count= "+count1);
        System.out.println("Zero values count= "+count2);
        }
    }
