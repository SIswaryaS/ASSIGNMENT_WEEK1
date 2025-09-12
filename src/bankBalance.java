public class bankBalance {
    public static void main(String[] args){
        int balance=-10;
        if (balance>0){
            System.out.println("Positive Balance");
        }
        else if (balance<0){
            System.out.println("Overdraft");
        }
        else if(balance==0){
            System.out.println("Zero Balance");
        }
    }

}
