import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRoll extends JFrame{
  private JPanel imagePanel;
  private JLabel imageLabel1;
  private JLabel imageLabel2;
  private JPanel buttonPanel;
  private JButton button;

  public DiceRoll(){
    setTitle("Dice Roll");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    buildImagePanel();
    buildButtonPanel();
    add(imagePanel, BorderLayout.NORTH);
    add(buttonPanel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }
  private void buildImagePanel(){
    imagePanel = new JPanel();
    imageLabel1 = new JLabel();
    imageLabel2 = new JLabel();
    imagePanel.add(imageLabel1);
    imagePanel.add(imageLabel2);
  }
  private void buildButtonPanel(){
    buttonPanel = new JPanel();
    button = new JButton("Roll the Dice");
    button.addActionListener(new ButtonListener());
    buttonPanel.add(button);
  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      Random rand = new Random();
      int roll = rand.nextInt(6);
      int roll2 = rand.nextInt(6);
      ImageIcon die1 = new ImageIcon("Die1.png");
      ImageIcon die2 = new ImageIcon("Die2.png");
      ImageIcon die3 = new ImageIcon("Die3.png");
      ImageIcon die4 = new ImageIcon("Die4.png");
      ImageIcon die5 = new ImageIcon("Die5.png");
      ImageIcon die6 = new ImageIcon("Die6.png");
      if (roll == 0)
        imageLabel1.setIcon(die1);
      else if (roll == 1)
        imageLabel1.setIcon(die2);
      else if (roll == 2)
        imageLabel1.setIcon(die3);
      else if (roll == 3)
        imageLabel1.setIcon(die4);
      else if (roll == 4)
        imageLabel1.setIcon(die5);
      else
        imageLabel1.setIcon(die6);
      if (roll2 == 0)
        imageLabel2.setIcon(die1);
      else if (roll2 == 1)
        imageLabel2.setIcon(die2);
      else if (roll2 == 2)
        imageLabel2.setIcon(die3);
      else if (roll2 == 3)
        imageLabel2.setIcon(die4);
      else if (roll2 == 4)
        imageLabel2.setIcon(die5);
      else
        imageLabel2.setIcon(die6);
      pack();
    }
  }
  public static void main(String[] args){
    new DiceRoll();
  }
}
