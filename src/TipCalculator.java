import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // Greeting and group info
        System.out.println("Hello Customer! Thank you for eating at our restaurant!");
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int groupNum = scan.nextInt();

        // asks for tip percentage
        System.out.print("What is the tip percentage, (0-100): ");
        int tip = scan.nextInt();

        //initilizaes and sets variables
        double totalBill = 0;
        double cost = 0;

        // user inputs cost which gets added onto the totalBill until the user presses -1
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, (enter -1 when done): ");
            cost = scan.nextDouble();
            totalBill += cost;
        }
        totalBill ++;

        String roundedTotalBill = formatter.format(totalBill);

        double totalTip = totalBill * ((double) tip / 100); // the total tip gets added and rounded in the next line
        String roundedTotalTip = formatter.format(totalTip);

        double totalBillWithTip = totalTip + totalBill; // the tip is added with the total bill and gets rounded after
        String roundedTotalBillWithTip = formatter.format(totalBillWithTip);

        double costPerPersonBeforeTip = totalBill / groupNum; // the cost for each person before the tip is included and rounded after
        String roundedCostPerPersonBeforeTip = formatter.format(costPerPersonBeforeTip);

        double tipPerPerson =  totalTip / groupNum; // the tip for each person gets calculated and rounded
        String roundedTipPerPerson = formatter.format(tipPerPerson);

        double costPerPerson = totalBillWithTip / groupNum; // the cost for each person including the tip, rounded
        String roundedCostPerPerson = formatter.format(costPerPerson);

        // prints all the receipt information for the user
        System.out.println("-----------------------------------------");
        System.out.println("Total Bill Without Tip: " + roundedTotalBill + "$");
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + roundedTotalTip + "$");
        System.out.println("Total Bill With Tip: " + roundedTotalBillWithTip + "$");
        System.out.println("Cost Per Person Before Tip: " + roundedCostPerPersonBeforeTip + "$");
        System.out.println("Tip Per Person: " + roundedTipPerPerson + "$");
        System.out.println("Total Cost Per Person: " + roundedCostPerPerson + "$");
        System.out.println("-----------------------------------------");
    }
}



