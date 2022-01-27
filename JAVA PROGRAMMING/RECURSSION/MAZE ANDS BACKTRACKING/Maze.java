import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans=pathCount(3,3);
        System.out.println(ans);
        printPath(3,3,"");
        System.out.println(returnPath("",3,3));
        System.out.println(diagnallyPath("",3,3));

    }

    static int pathCount(int r,int c){  //here I am considering that when it reaches to last row i.e 1 or
                                        //last column i.e 1 it will definitely reach the destination as they have only one choice
        if (r==1 || c==1){              // to move down or right at those last col and rows resp.
            return 1;
        }
        int down= pathCount(r-1,c);
        int right = pathCount(r,c-1);

        return down+right;
    }

    static void printPath(int r, int c, String p){
        if (r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if (r>1){
            printPath(r-1,c,p+'D');
        }
        if (c>1){
            printPath(r,c-1,p+'R');
        }
    }

    static ArrayList<String> returnPath(String p,int r,int c){
        if (r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1){
            list.addAll(returnPath(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(returnPath(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> diagnallyPath(String p ,int r,int c){
        if (r==1 && c==1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r>1 && c>1){
            list.addAll(diagnallyPath(p+'d',r-1,c-1));
        }
        if (r>1){
            list.addAll(diagnallyPath(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(diagnallyPath(p+'R',r,c-1));
        }
        return list;
    }
}
