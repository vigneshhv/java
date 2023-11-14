import java.util.Scanner;
class Phone_status{
   int abc;
   int status;
   void identify(int status){
    if(status==1){
        System.out.println("phone is on");
    }
    else if(status==2){
        System.out.println("phone is ringing");
    }
    else if(status==3){
        System.out.println("phone is Switchof");

    }
    
   }
   
}
 class oops_2 {
    public static void main(String []args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the number form 1-10 to know the status of the phone");
            Phone_status name = new Phone_status();
            name.abc = scan.nextInt();
            name.identify(name.abc);
        }
    }
}
