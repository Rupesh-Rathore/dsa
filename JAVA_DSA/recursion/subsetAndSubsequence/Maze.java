package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        Boolean[][] maze = {
            {true , true , true},
            {true , true , true},
            {true , true , true}
        };

        for (String string : mazeRunnerObstacleD("", maze, 0, 0)) {
            System.out.println(string);
        };
    }

    // only Down and Right movement
    static ArrayList<String> mazeRunner(String path, String dir, int rs, int re, int cs, int ce , int posX, int posY) {
        if (posX == re && posY == ce) {
            ArrayList <String> paths = new ArrayList<>();
            paths.add(path+" - "+dir);
            return paths;
        }

        ArrayList <String> downPaths = new ArrayList<>();
        ArrayList <String> rightPaths = new ArrayList<>();

        if (posX + 1 <= re) {
            downPaths = mazeRunner(path + "[" + posX + "," + posY + "]",dir + "D", rs + 1, re, cs, ce, posX + 1, posY);
        }
        if (posY + 1 <= ce) {
            rightPaths = mazeRunner(path + "[" + posX + "," + posY + "]",dir + "R", rs, re, cs + 1, ce, posX, posY + 1);
        }

        downPaths.addAll(rightPaths);
        
        return downPaths;
    }

    // Down , right and diagonally-down movement.
    static ArrayList<String> mazeRunnerD(String path, String dir, int rs, int re, int cs, int ce , int posX, int posY) {
        if (posX == re && posY == ce) {
            ArrayList <String> paths = new ArrayList<>();
            paths.add(path+" -> "+dir);
            return paths;
        }

        ArrayList <String> downPaths = new ArrayList<>();
        ArrayList <String> rightPaths = new ArrayList<>();
        ArrayList <String> diagonalPaths = new ArrayList<>();

        if (posX + 1 <= re && posY + 1 <= ce) {
            diagonalPaths = mazeRunnerD(path + "[" + posX + "," + posY + "]",dir + "X", rs + 1, re, cs + 1, ce, posX + 1, posY + 1);
        }
        if (posX + 1 <= re) {
            downPaths = mazeRunnerD(path + "[" + posX + "," + posY + "]",dir + "D", rs + 1, re, cs, ce, posX + 1, posY);
        }
        if (posY + 1 <= ce) {
            rightPaths = mazeRunnerD(path + "[" + posX + "," + posY + "]",dir + "R", rs, re, cs + 1, ce, posX, posY + 1);
        }

        downPaths.addAll(rightPaths);
        downPaths.addAll(diagonalPaths);
        
        return downPaths;
    }
    
    //Obstacle 
    static ArrayList<String> mazeRunnerObstacle(String dir, Boolean[][] maze, int posX, int posY) {
        if (posX == maze.length - 1 && posY == maze[0].length - 1) {
            ArrayList <String> paths = new ArrayList<>();
            paths.add(dir);
            return paths;
        }

        ArrayList <String> downPaths = new ArrayList<>();
        ArrayList <String> rightPaths = new ArrayList<>();

        if (maze[posX][posY] == false) return downPaths;

        if (posX < maze.length - 1) {
            downPaths = mazeRunnerObstacle(dir + "D", maze , posX + 1, posY);
        }
        if (posY < maze[0].length -1) {
            rightPaths = mazeRunnerObstacle(dir + "R", maze , posX, posY + 1);
        }

        downPaths.addAll(rightPaths);
        
        return downPaths;
    }
    
    //Obstacle dia
    static ArrayList<String> mazeRunnerObstacleD(String dir, Boolean[][] maze, int posX, int posY) {
        if (posX == maze.length - 1 && posY == maze[0].length - 1) {
            ArrayList <String> paths = new ArrayList<>();
            paths.add(dir);
            return paths;
        }

        ArrayList <String> downPaths = new ArrayList<>();
        ArrayList <String> rightPaths = new ArrayList<>();
        ArrayList <String> diagonalPaths = new ArrayList<>();

        if (maze[posX][posY] == false) return downPaths;

        if (posX < maze.length - 1 && posY < maze[0].length -1) {
            diagonalPaths = mazeRunnerObstacleD(dir + "X", maze , posX + 1, posY + 1);
        }
        if (posX < maze.length - 1) {
            downPaths = mazeRunnerObstacleD(dir + "D", maze , posX + 1, posY);
        }
        if (posY < maze[0].length -1) {
            rightPaths = mazeRunnerObstacleD(dir + "R", maze , posX, posY + 1);
        }

        downPaths.addAll(rightPaths);
        downPaths.addAll(diagonalPaths);
        
        return downPaths;
    }
}
