import java.util.Scanner;
import java.util.Random;
class game1{

    int value ,y ;
  


                boolean userinput()
                {
                Scanner abc = new Scanner(System.in);
                System.out.println("please enter the number");
                value = abc.nextInt();
                return true;
              
                }
              boolean checkinput()
                
              {
               
                if(value==y){
                  System.out.println("You have enterd the correct value ") ;
                  return true;
                  }
                  else if(value<y){
                    if(y-
                    value<5)
                    System.out.println("your guessed value is close but its lesser then the result");
                    System.out.println(y);
                    return false;
                  }
                  else if(value>y) {
                    if(value-y<5){
                    System.out.println("your guessed value is close but its greater  then the result");
                    return false;}
                  }
                 
                  return false;
                  }
                 game1()
                { Random rand = new Random();
                 this.y = rand.nextInt(100);
                 System.out.println(y);
                  
                }
              }
public class game {
    public static void main(String[] args){
       boolean check =false;
        game1 demo = new game1();
        while(!check){
          
           demo.userinput();
          check =  demo.checkinput();
        }
    }
}
