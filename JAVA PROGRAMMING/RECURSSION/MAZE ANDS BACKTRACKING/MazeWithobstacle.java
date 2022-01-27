import java.util.ArrayList;

public class MazeWithobstacle {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true,true},
                           {true,false,true,true},
                           {true,true,false,true},
                           {false,true,true,true}};
        System.out.println(pathWithObstacle("",board,0,0));

    }
    static ArrayList<String> pathWithObstacle(String p, boolean[][] maze,int r,int c){
        if (r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> list=new ArrayList<>();

        if(r<maze.length-1){
            list.addAll(pathWithObstacle(p+'D',maze,r+1,c));
        }
        if (c<maze[0].length-1){
            list.addAll(pathWithObstacle(p+'R',maze,r,c+1));
        }
        return list;
    }
}
