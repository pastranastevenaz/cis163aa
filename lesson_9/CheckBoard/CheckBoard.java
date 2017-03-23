import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class CheckBoard extends JFrame{

  private int[][] board= {
    {0,1,2,3,4,5,6,7},
    {8,9,10,11,12,13,14,15},
    {16,17,18,19,20,21,22,23},
    {24,25,26,27,28,29,30,31},
    {32,33,34,35,36,37,38,39},
    {40,41,42,43,44,45,46,47},
    {48,49,50,51,52,53,54,55},
    {56,57,58,59,60,61,62,63}
  };

  private GridLayout layout = new GridLayout(8,8);
  private Container con = getContentPane();
  private JButton lightButton0 = new JButton(String.valueOf(board[0][0]));
  private JButton lightButton1 = new JButton(String.valueOf(board[0][1]));
  private JButton lightButton2 = new JButton(String.valueOf(board[0][2]));
  private JButton lightButton3 = new JButton(String.valueOf(board[0][3]));
  private JButton lightButton4 = new JButton(String.valueOf(board[0][4]));
  private JButton lightButton5 = new JButton(String.valueOf(board[0][5]));
  private JButton lightButton6 = new JButton(String.valueOf(board[0][6]));
  private JButton lightButton7 = new JButton(String.valueOf(board[0][7]));
  private JButton lightButton8 = new JButton(String.valueOf(board[1][0]));
  private JButton lightButton9 = new JButton(String.valueOf(board[1][1]));
  private JButton lightButton10 = new JButton();
  private JButton lightButton11 = new JButton();
  private JButton lightButton12 = new JButton();
  private JButton lightButton13 = new JButton();
  private JButton lightButton14 = new JButton();
  private JButton lightButton15 = new JButton();
  private JButton lightButton16 = new JButton();
  private JButton lightButton17 = new JButton();
  private JButton lightButton18 = new JButton();
  private JButton lightButton19 = new JButton();
  private JButton lightButton20 = new JButton();
  private JButton lightButton21 = new JButton();
  private JButton lightButton22 = new JButton();
  private JButton lightButton23 = new JButton();
  private JButton lightButton24 = new JButton();
  private JButton lightButton25 = new JButton();
  private JButton lightButton26 = new JButton();
  private JButton lightButton27 = new JButton();
  private JButton lightButton28 = new JButton();
  private JButton lightButton29 = new JButton();
  private JButton lightButton30 = new JButton();
  private JButton lightButton31 = new JButton();
  private JButton lightButton32 = new JButton();
  private JButton lightButton33 = new JButton();
  private JButton lightButton34 = new JButton();
  private JButton lightButton35 = new JButton();
  private JButton lightButton36 = new JButton();
  private JButton lightButton37 = new JButton();
  private JButton lightButton38 = new JButton();
  private JButton lightButton39 = new JButton();
  private JButton lightButton40 = new JButton();
  private JButton lightButton41 = new JButton();
  private JButton lightButton42 = new JButton();
  private JButton lightButton43 = new JButton();
  private JButton lightButton44 = new JButton();
  private JButton lightButton45 = new JButton();
  private JButton lightButton46 = new JButton();
  private JButton lightButton47 = new JButton();
  private JButton lightButton48 = new JButton();
  private JButton lightButton49 = new JButton();
  private JButton lightButton50 = new JButton();
  private JButton lightButton51 = new JButton();
  private JButton lightButton52 = new JButton();
  private JButton lightButton53 = new JButton();
  private JButton lightButton54 = new JButton();
  private JButton lightButton55 = new JButton();
  private JButton lightButton56 = new JButton();
  private JButton lightButton57 = new JButton();
  private JButton lightButton58 = new JButton();
  private JButton lightButton59 = new JButton();
  private JButton lightButton60 = new JButton();
  private JButton lightButton61 = new JButton();
  private JButton lightButton62 = new JButton();
  private JButton lightButton63 = new JButton();

  public CheckBoard(){
    con.setLayout(layout);

    con.add(lightButton0);
    con.add(lightButton1);
    con.add(lightButton2);
    con.add(lightButton3);
    con.add(lightButton4);
    con.add(lightButton5);
    con.add(lightButton6);
    con.add(lightButton7);
    con.add(lightButton8);
    con.add(lightButton9);
    con.add(lightButton10);
    con.add(lightButton11);
    con.add(lightButton12);
    con.add(lightButton13);
    con.add(lightButton14);
    con.add(lightButton15);
    con.add(lightButton16);
    con.add(lightButton17);
    con.add(lightButton18);
    con.add(lightButton19);
    con.add(lightButton20);
    con.add(lightButton21);
    con.add(lightButton22);
    con.add(lightButton23);
    con.add(lightButton24);
    con.add(lightButton25);
    con.add(lightButton26);
    con.add(lightButton27);
    con.add(lightButton28);
    con.add(lightButton29);
    con.add(lightButton30);
    con.add(lightButton31);
    con.add(lightButton32);
    con.add(lightButton33);
    con.add(lightButton34);
    con.add(lightButton35);
    con.add(lightButton36);
    con.add(lightButton37);
    con.add(lightButton38);
    con.add(lightButton39);
    con.add(lightButton40);
    con.add(lightButton41);
    con.add(lightButton42);
    con.add(lightButton43);
    con.add(lightButton44);
    con.add(lightButton45);
    con.add(lightButton46);
    con.add(lightButton47);
    con.add(lightButton48);
    con.add(lightButton49);
    con.add(lightButton50);
    con.add(lightButton51);
    con.add(lightButton52);
    con.add(lightButton53);
    con.add(lightButton54);
    con.add(lightButton55);
    con.add(lightButton56);
    con.add(lightButton57);
    con.add(lightButton58);
    con.add(lightButton59);
    con.add(lightButton60);
    con.add(lightButton61);
    con.add(lightButton62);
    con.add(lightButton63);

    setSize(400,400);
    this.setDefaultCloseOperation(3);
  }
  public static void main(String[] args) {
    CheckBoard frame = new CheckBoard();
    frame.setVisible(true);
  }
  //  JFrame mainJFrame = new JFrame("CheckBoard");
  //
  //
  // public void paint(Graphics g) {
  //
  //        int row;   // Row number, from 0 to 7
  //        int col;   // Column number, from 0 to 7
  //        int x,y;   // Top-left corner of square
  //
  //        for ( row = 0;  row < 8;  row++ ) {
  //
  //           for ( col = 0;  col < 8;  col++) {
  //              x = col * 20;
  //              y = row * 20;
  //              if ( (row % 2) == (col % 2) )
  //                 g.setColor(Color.red);
  //              else
  //                 g.setColor(Color.black);
  //              g.fillRect(x, y, 20, 20);
  //           }
  //
  //        }
  //
  //     }
  //
  // public void createMainJFrame(){
  //   mainJFrame.setSize(160,160);
  //   mainJFrame.setVisible(true);
  //   // 3 == EXIT_ON_CLOSE
  //   mainJFrame.setDefaultCloseOperation(3);
  //   mainJFrame.setDefaultLookAndFeelDecorated(true);
  //   mainJFrame.setLayout(new FlowLayout());
  // }
  //
  // public void populate(){
  //   JLabel greeting = new JLabel("Hello");
  //   mainJFrame.add(greeting);
  //   JButton button = new JButton();
  //   button.setSize(new Dimension(40,20));
  //   mainJFrame.add(button);
  // }
  //
  // public static void main(String[] args) {
  //   CheckBoard newCheckBoard = new CheckBoard();
  //   newCheckBoard.createMainJFrame();
  //   newCheckBoard.populate();
  //   // newCheckBoard.paint();
  // }


}
