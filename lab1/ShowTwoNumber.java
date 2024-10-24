import javax.swing.JOptionPane;
public class ShowTwoNumber {
    public static void main(String[] args) {
        String str1,str2;
        String strNotification;
        str1 = JOptionPane.showInputDialog(null, "Enter your first number", "First number", JOptionPane.INFORMATION_MESSAGE);
        strNotification = "You have just enter: " + str1;
        str2 = JOptionPane.showInputDialog(null, "Enter the second number", "Second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += " and " + str2;
        JOptionPane.showMessageDialog(null, strNotification, "ShowTwoNumber", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
