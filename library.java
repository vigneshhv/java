import java.util.Scanner;
class operation{
    Scanner sc = new Scanner(System.in);
    int input,top;
String book[] = new String[10];
        int input(){
            return sc.nextInt();
        }

    void addBook(){

    }
    void issueBook()
    {

    }
    void returnbook(){

    }
    void Showbook() {

    }
}
public class library {
   public static void main(String[] args){
     int a ;
 
     operation ab = new operation();
  System.out.println("1 to add book \n 2 issue book \n 3 to return book \n 4 to show avilable book \nEnter the valid input");
     a=ab.input();
      oper: switch(a){
        case 1:{
            ab.addBook();
            break oper;
        }
        case 2:{
            ab.issueBook();
            break oper;
        }
        case 3:{
            ab.returnbook();
            break oper;
        }
        case 4:{
            ab.Showbook();
            break oper;
        }
        default:{break oper;}

     }
   } 
}
