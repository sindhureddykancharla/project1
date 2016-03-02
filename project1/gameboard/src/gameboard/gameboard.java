package gameboard;
import java.util.Scanner;
public class gameboard 
{
    private static Scanner input;

	public static boolean putDisk(char[][] field, int column, char color) 
    {
        if (field[0][column] != ' ')
            return false;

        for (int row = 0; row < 7; ++row)
        {
                if (field[row][column] != ' ')
                {
              
                field[row-1][column] = color;
                return true;
            }
        }
       
        field[6][column] = color;
        return true;
    }
    private static char getWinnerInColumns(char[][] field)
    {
        for (int column = 0; column < 7; ++column)
        {
            int count = 0;
            
            for (int row = 1; row < 7; ++row)
            {
                if (field[row][column] != ' ' &&
                    field[row][column] == field[row-1][column])
                {
                    ++count;
                }
                else
                    count = 1;

              
                if (count >= 4)
                {
                    
                    return field[row][column];
                }
            }
        }
        
        return ' ';
    }
 
    

    public static char getWinner(char[][] field) 
    {
        char winner = getWinnerInColumns(field);
        if (winner != ' ') return winner;
    
            
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[i].length; j++)
                if (field[i][j] == ' ') return ' ';

        return 'C';
    }

    public static void printField(char[][] field) 
    {
        for (int row = 0; row < 7; ++row)
        {
            System.out.print("| ");
            for (int col = 0; col < 7; ++col)
                System.out.print(field[row][col] + "- ");
                System.out.println();
        }

        for (int col = 0; col < 7; ++col)
            System.out.print("---");
        System.out.println();
    }

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
     
        char[][] field = new char[7][7];

        for (int i = 0; i < 7; ++i)
            for (int j = 0; j < 7; ++j)
                field[i][j] = ' ';
        
        printField(field);

    
        boolean isBlue = true;
        while (true)
        {
            if (isBlue)
            {
                System.out.println("Blue's turn!");            
            }
                else 
                {
                	System.out.println("White's turn!");
                	System.out.print("Choose column (1-7) for a disk:");
                }
                
           	int column = input.nextInt();
   
            if (column < 1 || column > 7)
            {
                System.out.println("Column should be from 1 to 7");
                continue;
            }
            
            if (!putDisk(field, column - 1, isBlue ? 'B' : 'W')) 
            {
                System.out.println("This column is filled! Choose another one.");
                continue;
            }

            printField(field);

            
            char result = getWinner(field);
            if (result == 'D')
            {
                System.out.println("It is a draw!");
                break;
            }
            else if (result == 'B')
            {
                System.out.println("Blue win!");
                break;
            }
            else if (result == 'W')
            {
                System.out.println("White win!");
                break;
            }
           
            isBlue = !isBlue;
        }
    }
}