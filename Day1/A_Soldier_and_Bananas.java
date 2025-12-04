import java.util.Scanner;

public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   int borrow;
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int total = 0;

        for (int i = 1; i <= w; i++) {
            total = total + (i * k);  
        }
  borrow = total -n;
  if(borrow>0){
    System.out.println(borrow);
  }else{
    System.out.println("0");
  }
// System.out.println( (borrow > 0 ) ? borrow : "0" );

    }
}
