public class Formula {
    public static void main(String[] args) {
        int h=100;
        int a=15;
        int m=10;
        long ans= Math.round(Math.sqrt(Math.pow((330*Math.sin(a*Math.PI/180)+h-m/Math.cos(a*Math.PI/180)),2)+Math.pow(130*Math.cos(a*Math.PI/180)+113+m/Math.tan(a*Math.PI/180),2)));
//        System.out.println(Math.PI/180);
        System.out.println(ans);
        System.out.println(Math.sin(a*Math.PI/180));
    }

}
