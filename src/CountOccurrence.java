public class CountOccurrence {
    public static void main(String[] args) {
      int[] arr=  {2, 4, 2, 6, 2, 9, 6};
      int i=0;
      int count=0;
      int count1=0;
      int count2=0;
      int count3=0;
      for (i=0; i<arr.length; i++){
          if (arr[i]==2){
              count+=1;
          }
          else if (arr[i]==4){
              count1+=1;
          }
          else if (arr[i]==6){
              count2 += 1;
          }
          else if (arr[i]==9){
              count3 += 1;
          }

      }
        System.out.println("2 appears " +count+" times");
        System.out.println("4 appears " +count1+" times");
        System.out.println("6 appears " +count2+" times");
        System.out.println("9 appears " +count3+" times");
    }
}
