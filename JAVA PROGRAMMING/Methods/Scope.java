public class Scope {
    public static void main(String[] args) {
        int c = 100;
        String ca="ghfghh";
        System.out.println(ca);
        {
            c=110;
            int b = 2000;
            System.out.println(b);
        }
        String b="hbbfvchjsd";
        System.out.println(b);
    }


}
