import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGUI extends JFrame{
  private StatsPanel player1;
  private StatsPanel player2;
  public TestGUI(){
    setTitle("TestGUI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    player1 = new StatsPanel(1);
    player2 = new StatsPanel(2);

    add(player1, BorderLayout.WEST);
    add(player2, BorderLayout.EAST);
    pack();
    setVisible(true);
  }

  public static void main(String[] args){
    new TestGUI();
  }
}
