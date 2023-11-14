 class cylinder1
{private int radius;
 private int height;
 public int getradius()
 {
    return radius;
 }
 public int getheight(){
    return height;
 }
 public void setradius(int radius){
    this.radius=radius;
 }
 public void setheight(int height){
    this.radius=height;
 }}
 class cylinder{
public static void main(){
    cylinder1 sonu=new cylinder1();
    sonu.setradius(18);
    sonu.setheight(22);
    System.out.println(sonu.getradius());
    System.out.println(sonu.getheight());
} 
}
    

