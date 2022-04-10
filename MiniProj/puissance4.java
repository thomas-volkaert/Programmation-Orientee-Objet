import java.util.Arrays;
import java.util.EnumMap;

public class puissance4
{
    private static final char[] players = new char[] {'R','Y'};
    private final int width, height;
    private final char[][] grid;

    public puissance4(int width, int height){
        this.width = width;
        this.height = height;
        this. grid = new char[height][];
        for(int i = 0; i < height; i++){
            Arrays.fill(this.grid[i] = new char[width], '.');

        }
    }

    public static void printBoard(){
        for(int i = 0; width > i; i++){
            for(int j = 0; height > j; j++)
        }
    }

    public void chooseAndDrop(char symbol, Scanner input) {
        do {
            System.out.print("\nPlayer " + symbol + " turn: ");
            int col = input.nextInt();

            if (! (0 <= col && col < this.width)) {
                System.out.println("Column must be between 0 and " +
                                   (this.width - 1));
                continue;
            }
            for (int h = this.height - 1; h >= 0; h--) {
                if (this.grid[h][col] == '.') {
                    this.grid[this.lastTop=h][this.lastCol=col] = symbol;
                    return;
                }
            }

            System.out.println("Column " + col + " is full.");
        } while (true);
    }

    public static void main(String [] args)
    {
        boolean win = false;
        while(win = false){
            
        }
    }
}