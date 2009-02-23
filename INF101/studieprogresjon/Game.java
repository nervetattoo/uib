package studieprogresjon;

import studieprogresjon.Semester;
import java.util.Random;

/**
 * Runs actual game!
 * @author Raymond Julin
 */
public class Game {
    public static void main(String[] args) {
        // Use some random coordinates for student position
        int width = 10;
        int height = 10;
        Random r = new Random();
        int x = r.nextInt(width);
        int y = r.nextInt(height);
        int level = 0;

        // Start main loop
        Semester sem;
        Student stud;
        System.out.println("Velkommen til Studieprogresjon!");
        while (true) {
            level++;
            stud = new Student(new Position(x,y));
            sem = new Semester(stud, level, width, height);
            sem.runGame();
            // Check to see endgame result
            if (sem.won()) {
                if (level == 6) {
                    // Finished bachelorgrade
                    System.out.println("Gratulerer, du har fullført din bachelorgrad");
                    break;
                }
            }
            else {
                // Lost :(
                System.out.println("Studielån: " + (level * 42500));
                break;
            }
        }
            
    }
}
