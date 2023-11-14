import java.util.Scanner;
public class metod_4 {
    static void convert(double a){
          System.out.println("the converted value n fareenheat is "+((a*9/5) + 32));
    }
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a value in degree:");
            double deg= scan.nextInt();
      convert(deg);
        }
    }
}
