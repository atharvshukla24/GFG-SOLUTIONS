import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int x=n/10;
        int y=n%10;
        
        System.out.print(Math.abs(y));
    }
}