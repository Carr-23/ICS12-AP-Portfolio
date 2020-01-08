/*
Braulio Carrion
Ms. Krasteva
04/15/19
This uses recursion to get through a maze. It first finds where the maze starts
Either in first row or first column. Once if find the start it manouvers around
the maze until the end is found. It removes the steps it already made so it doesnt
go backwards
*/
import java.util.*;

public class MazeGen {

    int maze[][] = {
        {1, 1, 1, 1, 1},
        {0, 1, 1, 0, 0},
        {0, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 0, 1}
    };

    public void findEntrance() {

        for (int i = 0; i < 5; i++) {
            if (maze[0][i] == 0) {
                System.out.println("Status: " + exitPlan(i, 0));
                break;
            } else if (maze[i][0] == 0) {
                System.out.println("Status: " + exitPlan(0, i));
                break;
            }
        }
    }

    public boolean exitPlan(int x, int y) {
        maze[y][x] = 1;
        if (x == 4 && y == 1) {
            return true;
        }
        if (maze[y][x + 1] == 0) {
            return exitPlan(x + 1, y);
        } else if (y == 0) {
            if (maze[y + 1][x] == 0) {
                return exitPlan(x, y + 1);
            }
        } else if (y == 4) {
            if (maze[y - 1][x] == 0) {
                return exitPlan(x, y - 1);
            }
        }else {
            if (maze[y - 1][x] == 0) {
                return exitPlan(x, y - 1);
            }else if (maze[y + 1][x] == 0) {
                return exitPlan(x, y + 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MazeGen mg = new MazeGen();
        mg.findEntrance();
    }
}
