package JAVA_DSA.recursion.backtracking;

public class BackTRacking {
    public static void main ( String[] args) {
        int[][] maze = {
            {0 , 0 , 0},
            {0 , 0 , 0},
            {0 , 0 , 0},
        };
        backTrack("", maze, 0 , 0 , 1);
    }

    // Here while while creating a path you can step on any cell only once , meaning a path will never repeat a cell

    static void backTrack (String path, int[][] maze , int posx , int posy, int step){
        if (posx == maze.length - 1 && posy == maze[0].length - 1){
            maze[posx][posy] = step;
            System.out.println(path);
            display(maze);
            maze[posx][posy] = 0;
            return;
        }

        if (maze[posx][posy] != 0) return;
        maze[posx][posy] = step;
        
        // ⁡⁢⁣⁣DOWN⁡
        if (posx < maze.length - 1) backTrack(path + " D ", maze, posx + 1, posy , step + 1);
        // ⁡⁢⁣⁣RIGHT⁡
        if (posy < maze[0].length - 1) backTrack(path + " R ", maze, posx, posy + 1 ,step + 1);
        // ⁡⁢⁣⁣UP⁡
        if (posx > 0) backTrack(path + " U ", maze, posx - 1, posy ,step + 1);
        // ⁡⁢⁣⁣LEFT⁡
        if (posy > 0) backTrack(path + " L ", maze, posx, posy - 1 , step + 1);
        
        maze[posx][posy] = 0;

    }

    static void display (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
