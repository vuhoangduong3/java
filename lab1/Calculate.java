import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Enter first number", "First number", JOptionPane.INFORMATION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null, "Enter second number", "Second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double sum = num1 + num2;
        double dif = num1 - num2;
        double product = num1 * num2;
        String quotient;
        if(num2 == 0){
            quotient = "Indivisible";
        }
        else{
            quotient = ""+ num1/num2;
        }
        String result = " sum: "+ sum +"\n different: "+ dif +"\n Product: " + product + "\n quotient: " + quotient;
        JOptionPane.showMessageDialog(null,result,"result",JOptionPane.INFORMATION_MESSAGE);    
    }
}
