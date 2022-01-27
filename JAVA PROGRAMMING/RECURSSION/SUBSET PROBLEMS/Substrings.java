import java.util.ArrayList;

public class Substrings {
    public static void main(String[] args) {
        String str= "abc";
//        System.out.println(substringArray(str,"",new ArrayList<>()));
        System.out.println(substringArrayInBody(str,""));

    }
    // here I took the ArrayList as the argument of the function
    static ArrayList<String> substringArray(String up,String p, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        substringArray(up.substring(1),p,list);
        return substringArray(up.substring(1),p+ch,list);

    }
    // here I made the ArrayList in the body of the function
    static ArrayList<String> substringArrayInBody(String up,String p){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left= substringArrayInBody(up.substring(1),p);
        ArrayList<String> right= substringArrayInBody(up.substring(1),p+ch);

        left.addAll(right);
        return left;
    }

}
