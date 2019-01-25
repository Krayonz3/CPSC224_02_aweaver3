import javax.swing.JOptionPane;
public class conversion {   // Save as "conversion.java"
  public static void main(String[] args) {
    menu();
  }
  public static void menu() {
    String input;
    double meters;
    input = JOptionPane.showInputDialog("Enter a distance in meters:");
    meters = Double.parseDouble(input);
    String option;
    int value;
    option = JOptionPane.showInputDialog("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program");
    value = Integer.parseInt(option);
    while (value != 4){
      if (value == 1) {
        showKilometers(meters);
        menu();
      }
      if (value==2) {
        showInches(meters);
        menu();
      }
      if (value==3) {
        showFeet(meters);
        menu();
      }
    }
    if (value==4) {
      System.exit(0);
    }
    else {
      JOptionPane.showMessageDialog(null, "Invalid Input. Try again.");
      menu();
    }
   }
  public static void showKilometers(double meters) {
    double kilometers;
    kilometers = meters * .001;
    JOptionPane.showMessageDialog(null, kilometers);
  }
  public static void showInches(double meters) {
    double inches;
    inches = meters * 39.37;
    JOptionPane.showMessageDialog(null, inches);
  }
  public static void showFeet(double meters) {
    double feet;
    feet = meters * 3.281;
    JOptionPane.showMessageDialog(null, feet);
  }
}
