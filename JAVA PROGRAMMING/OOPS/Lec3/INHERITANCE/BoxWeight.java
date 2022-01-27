package Lec3.INHERITANCE;

public class BoxWeight extends Box{
    int boxWeight;
    public BoxWeight(int h,int w,int l, int bw){
        super(h,w,l);
        this.boxWeight=bw;
    }
    public void getdimension(){
        getdim();
    }
}
