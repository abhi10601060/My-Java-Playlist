import java.util.Locale;

public class SkipWord {
    public static void main(String[] args) {
        String str="appacjshacapplejkaaa";
//        skip("", str);
//        String ans=skip1(str);
//        System.out.println(ans);
//        skipApple(new StringBuilder(),str);
        skipApp(new StringBuilder(),str);


    }
    static void skip(String p,String up){   // here taking the answer String in the Argument
        if (up==""){
            System.out.println(p);
            return ;
        }
        char ch= up.charAt(0);

        if (ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip1(String up){
        if (up==""){
            return up;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skip1(up.substring(1));
        }
        else {
            return ch+skip1(up.substring(1));
        }
    }
    static void skipApple(StringBuilder p, String up){  // skip word
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(up.startsWith("apple")){
            skipApple(p,up.substring(5));
        }
        else{
            p.append(ch);
            skipApple(p,up.substring(1));
        }
    }
    //only skip app when its not apple
    static void skipApp(StringBuilder p, String up){
        if (up == "") {
            System.out.println(p);
            return;
        }
        if (up.startsWith("app")&& up.startsWith("apple")){
            p.append(up.charAt(0));
            skipApp(p,up.substring(1));
        }
        else if (up.startsWith("app")){
            skipApp(p,up.substring(3));
        }
        else{
            skipApp(p.append(up.charAt(0)),up.substring(1));
        }

    }
}
