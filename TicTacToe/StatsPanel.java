import javax.swing.*;
import java.awt.*;

public class StatsPanel extends JPanel {
  private char symbol;
  private int wins = 0;
  private int losses = 0;
  private JTextField setName; // To set name
  private JLabel setWins; // To show wins
  private JLabel setLosses; // To show losses
  private JLabel winsLabel; // "Wins:"
  private JLabel lossesLabel; // "Losses:"
  private JLabel nameLabel; // "Name:"

  public StatsPanel(int player){
    // Create grid layout for StatsPanel
    setLayout(new GridLayout(3, 2));

    // Create editable text field.
    JTextField setName = new JTextField("Player" + player, 8);

    // Create Labels
    winsLabel = new JLabel("Wins:");
    lossesLabel = new JLabel("Losses:");
    nameLabel = new JLabel ("Name:");
    setWins = new JLabel (String.valueOf(wins));
    setLosses = new JLabel (String.valueOf(losses));

    //set player symbol for border
    if (player == 1)
      symbol = 'X';
    else
      symbol = 'O';

    //create labeled border
    setBorder(BorderFactory.createTitledBorder("Player " + player + " (" + symbol + "):"));

    // Add text field and labels to panel
    add(nameLabel);
    add(setName);
    add(winsLabel);
    add(setWins);
    add(lossesLabel);
    add(setLosses);
  }

  // Resets player stats
  public void resetStats(){
    wins = 0;
    losses = 0;
  }
  // adds a player loss
  public void addLoss(){
    losses++;
  }
  // adds a player win
  public void addWin(){
    wins++;
  }
}
