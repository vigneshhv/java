import java.util.Scanner;
public class metod_3 {
static void sum(int n){
    int sum =0;
    System.out.print("The fibbonacii sereis is:1,");
    for(int i=1;i<n;i++) {
        sum = i+i-1;
    System.out.print(sum+",");}
}
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int a =scan.nextInt();
            sum(a);
        }

    }
}
