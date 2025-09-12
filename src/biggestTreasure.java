public class biggestTreasure {
    public static void main(String[] args) {
        int a=10999;
        int b=1000;
        int c=101;
        if (a>b && a>c){
            System.out.println(a);
        }
        else if (b>a && b>c){
            System.out.println(b);
        }
        else if (c>a&&c>b){
            System.out.println(c);
        }
    }
}
