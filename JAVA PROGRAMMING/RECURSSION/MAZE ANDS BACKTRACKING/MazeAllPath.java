import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
//        boolean[][] board={{true,true,true},
//                {true,true,false},
//                {true,true,true}};
//        System.out.println(returnAlDirPath("",board,0,0));
        int[][] board={{0,0,0},
                       {0,0,0},
                       {0,0,0}};
        printMaze("",board,0,0,1);
    }
    static ArrayList<String> returnAlDirPath(String p, boolean[][] maze,int r,int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> list =new ArrayList<>();
        maze[r][c]=false;

        if(r<maze.length-1){
            list.addAll(returnAlDirPath(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(returnAlDirPath(p+'R',maze,r,c+1));
        }
        if(r>0){
            list.addAll(returnAlDirPath(p+'U',maze,r-1,c));
        }
        if(c>0){
            list.addAll(returnAlDirPath(p+'L',maze,r,c-1));
        }
        maze[r][c]=true;
        return list;
    }
    static void printMaze(String p, int[][] maze,int r,int c,int lvl){
        if (r==maze.length-1 && c==maze[0].length-1){
            maze[r][c]=lvl;
            for (int[] arr : maze){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c]>0){
            return;
        }

        maze[r][c]=lvl;

        if(r<maze.length-1){
            printMaze(p+'D',maze,r+1,c,lvl+1);
        }
        if(c<maze[0].length-1){
            printMaze(p+'R',maze,r,c+1,lvl+1);
        }
        if(r>0){
            printMaze(p+'U',maze,r-1,c,lvl+1);
        }
        if(c>0){
            printMaze(p+'L',maze,r,c-1,lvl+1);
        }

        maze[r][c]=0;
    }
}
