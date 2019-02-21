import javax.swing.*;
import java.awt.event.*;

public class LatinTranslator extends JFrame {
  private JButton button1;    // Button 1
  private JButton button2;    // Button 2
  private JButton button3;    // Button 3
  private JPanel panel;
  private final int WINDOW_WIDTH = 300; // Window width
  private final int WINDOW_HEIGHT = 70; // Window height

  public LatinTranslator(){
    setTitle("Latin Translator");
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button1 = new JButton("SINISTER");
    button2 = new JButton("DEXTER");
    button3 = new JButton("MEDIUM");
    button1.addActionListener(new ButtonListener());
    button2.addActionListener(new ButtonListener());
    button3.addActionListener(new ButtonListener());
    panel = new JPanel();
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    add(panel);
    setVisible(true);
  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      String actionCommand = e.getActionCommand();
      if (actionCommand.equals("SINISTER"))
      {
        JOptionPane.showMessageDialog(null, "Left");
      }
      else if (actionCommand.equals("DEXTER"))
      {
        JOptionPane.showMessageDialog(null, "Right");
      }
      else if (actionCommand.equals("MEDIUM"))
      {
        JOptionPane.showMessageDialog(null, "Center");
      }
    }
  }
  public static void main(String[] args)
    {
      new LatinTranslator();
    }
}
