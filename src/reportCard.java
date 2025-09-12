public class reportCard {
    public static void main(String[] args) {
        int Mark=50;
        if (Mark>=90){
            System.out.println("A");
        }
        else if(Mark>=75 && Mark <90){
            System.out.println("B");
        }
        else if(Mark>=50 && Mark<75){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
