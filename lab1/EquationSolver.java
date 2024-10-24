import javax.swing.JOptionPane;

public class EquationSolver {
    public static String firstdegree(double a, double b){
        if(a == 0){
            if(b == 0){ 
                return "Infinite solution";
            }
            else{
                return "No solution";
            }
        }
        else{
            double sol =  -b/a;
            return "x = "+ sol;
        } 
    }
    public static String Linearsystem(double a1, double b1, double c1 , double a2, double b2, double c2){
        double D,Dx,Dy,x,y;
        
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy == 0){
                return "Infinite Solution";
            }
            else{
                return "No solution";
            }
        }
        else{
            x = Dx/D;
            y = Dy/D;
            return "x = "+ x + "y = "+ y;
        }
    }
    public static String secondDegree(double a, double b, double c) {
        if (a == 0) {
            return firstdegree(b, c); 
        }
    
        double delta = b * b - 4 * a * c;
    
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            return "No solution";
        }
    }
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("1. First_Degree equation\n"+
                "2. Linearsystem\n"+
                "3. Second_Degree equation");
        int choice = Integer.parseInt(input);
        if(choice == 1){
            String input_a = JOptionPane.showInputDialog("Enter a");
            String input_b = JOptionPane.showInputDialog("Enter b");
            double a = Double.parseDouble(input_a);
            double b = Double.parseDouble(input_b);
            String result1 = firstdegree(a,b);
            JOptionPane.showMessageDialog(null, result1);
        }
        else if(choice == 2){
            double a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a1:"));
                    double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
                    double c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter c1:"));
                    double a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a2:"));
                    double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));
                    double c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter c2:"));
                    String result2 = Linearsystem(a1,b1,c1,a2,b2,c2);
                    JOptionPane.showMessageDialog(null, result2);
        }
        else if(choice == 3){
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a :"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));
            String result3 = secondDegree(a,b,c);
            JOptionPane.showMessageDialog(null, result3);
        }
    }
    
}
