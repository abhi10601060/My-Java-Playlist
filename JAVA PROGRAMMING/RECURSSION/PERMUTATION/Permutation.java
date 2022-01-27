import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"");
        System.out.println(permutationList(str,""));

    }
    static void permutation(String up ,String p){
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch =up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i,p.length());

            permutation(up.substring(1),f+ch+s);

        }
    }
    static ArrayList<String> permutationList(String up, String p){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(permutationList(up.substring(1),f+ch+s));

        }
        return ans;
    }
}
