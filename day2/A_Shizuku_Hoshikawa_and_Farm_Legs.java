import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Example input
        int numbers = in.nextInt();
        int[] arr = new int[numbers];
  for (int i = 0; i <numbers; i++) {
    arr[i] = in.nextInt();
  }
for (int i = 0; i < arr.length; i++) {
       int ways = countFarmConfigs(arr[i]);
        System.out.println(ways);
     
}
    }

    public static int countFarmConfigs(int n) {
        int count =0;
        if(n%2 == 0 ){
            for (int cow = 0; cow <= n/2; cow++) {
                int hen = n - cow *4;
                if(hen>=0) {
                    count++;
                }
            }
        }

        else {
            return 0;
        }

        return count;
    }
}
