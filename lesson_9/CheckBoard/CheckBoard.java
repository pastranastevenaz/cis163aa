import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
/**
* <h1>CheckBoard</h1>
* <p>The Checkboard class uses the awt Graphics library to
* draw an 8X8 black and red checker board grid. It uses nessted for
* loops to draw each individual square. The color of the squares are
* determined by an algorithm that set the square's color to red if
* the value of the row and col variables are both even numbers. /p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-23
*/
public class CheckBoard extends JFrame{
   public void paint(Graphics g){
      int row;
      int col;
      int x;
      int y;
      for ( row = 0;  row < 9;  row++ )
      {
         for ( col = 0;  col < 8;  col++)
         {
            x = col * 50;
            y = row * 50;
             if ( (row % 2) == (col % 2) )
               g.setColor(Color.RED);
            else
               g.setColor(Color.BLACK);

            g.fillRect(x, y, 50, 50);
         }
      }
   }

   public static void main(String args[]) {
        CheckBoard check = new CheckBoard();
        check.setTitle("Check Board");
        check.setSize(400, 400);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}
