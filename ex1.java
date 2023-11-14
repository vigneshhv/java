class volume{
     int height ,width;
    volume (int h ,int w){
        height = h;
        width = w;

    }
    int getterw(){
        return width;
       
    }
    int getterh(){
        return height;
       
    }
    int volume(){
        int volume = (int)3.14*width*width*height;
        return volume;
    }
    double surface(){
        double surface = 2*3.14*width*(width+height);
        return surface;
    }
}
class ex1{
    public static void main(String []args){
        int h =34,w=67;
        volume abc = new volume(h,w);
        
        System.out.println(abc.getterh() + "and the volume is given as "+abc.getterw());
        System.out.println("the surface area is"+abc.surface()+"and the volume is "+abc.volume());
    }
}