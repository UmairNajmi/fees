// Fees.java
// Displays tuition and book fees 
import java.util.Scanner;
class Fees
{
    public static void main(String[] args)
    {
        double creditHours;
        final double HOUR_FEE = 85;
        double tuitionFee;
        double bookFee;
        final double ATHLETIC_FEE = 65;
        double sum;
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter credit hours ");
        creditHours = input.nextDouble(); 
        System.out.print("Enter book fees ");
        bookFee = input.nextDouble();
        sum = (creditHours * HOUR_FEE) + bookFee + ATHLETIC_FEE; 
        System.out.println("Credit hours = " + creditHours); 
        System.out.println("Rate per hour is $" + HOUR_FEE);
        System.out.println("So tuition is $" + (creditHours *
    HOUR_FEE));
        System.out.println("Book fee is $" + bookFee);
        System.out.println("Athletic fee is $" + ATHLETIC_FEE); 
        System.out.println("Total fees:$" + sum);
    }
} 