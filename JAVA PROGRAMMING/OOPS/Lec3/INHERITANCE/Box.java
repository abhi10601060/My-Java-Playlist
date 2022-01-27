package Lec3.INHERITANCE;

public class Box {
    int h=-1;
    int w=-1;
    int l=-1;
    public Box(){
    }
    public Box(int h, int w,int l){
        this.h=h;
        this.w=w;
        this.l=l;
    }

    public Box(Box other){
        this.h=other.h;
        this.w=other.w;
        this.l=other.l;
    }
    public void getdim(){
        System.out.println(this.l);
        System.out.println(this.h);
        System.out.println(this.w);

    }


}
