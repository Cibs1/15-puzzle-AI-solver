import java.util.*;
import java.io.*;  
public class Jogo_dos_15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Choose your algorythm!\nOptions:\n<<BFS, DFS, IDFS, A*-misplaced, A*-Manhattan, Greedy-misplaced, Greedy-Manhattan>>");
        Scanner stdin = new Scanner(System.in);
        String a = stdin.nextLine();
        if (a.equals("BFS")){
            BFS_15correto.main(args);
        }
        if(a.equals("DFS")){
            DFS.main(args);
        }
        if(a.equals("IDFS")){
            IDFS.main(args);
        }
        if(a.equals("A*-misplaced")){
            Astar_misplaced.main(args);
        }
        if(a.equals("A*-Manhattan")){
            Astar_manhattan.main(args);
        }
        if(a.equals("Greedy-misplaced")){
            greedy_misplaced.main(args);
        }
        if(a.equals("Greedy-Manhattan")){
            greedy_manhattan.main(args);
        }
    }
}
