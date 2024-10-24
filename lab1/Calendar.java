import java.util.Scanner;
public class Calendar {
    public static int days_of_month(int a, int b){
        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            return 31;
        }
        else if( a == 4 || a == 6 || a == 9 || a == 11){
            return 30;
        }
        else if( a == 2){
            if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0)) {
                return 29; 
            } else {
                return 28; 
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 100000; i++){
            System.out.print("Enter the month: ");
            int month = keyboard.nextInt();
            System.out.print("Enter the year: ");
            int year = keyboard.nextInt();
            if(1 <= month && month <= 12 && year > 0){
                int days = days_of_month(month, year);
                System.out.println("month " + month + " of year" + year + " has: " + days);
                break;
            }
            else{
                System.out.println("Please enter again");
                continue;
            }
        } 
        keyboard.close();
    }
}
