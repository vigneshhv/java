import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int c=0,j=0; 
         a++;
         String arr[];
         arr = new String[a];
          
         while(j<a)
         {
            arr[j]=scan.nextLine();
          j++;

         }
        for(j=1;j<a;j++){
            
            for (int i = 0; i < arr[j].length(); i++) {
                
              int characterValue = arr[j].charAt(i);
              c += Integer.bitCount(characterValue);
            }
                      System.out.println(c);

          if(c<=64){
               System.out.println(arr[j]+" can be fitted in:");
           
            if(c<=8)
            {
                System.out.println("byte");
            }
            if(c<=16)
            {
                System.out.println("short"); 
            }
            if(c<=32)
            {

                System.out.println("int");
               
            }
            if(c<=64)
            {
                System.out.println("long");
            }

        }
            else{
                 System.out.println(arr[j]+" can't be fitted anywhere");
            }
            c=0;

        }
    }
}
