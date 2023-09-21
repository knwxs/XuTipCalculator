import java.util.Scanner;

public class XuTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator.");
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100)");
        int tipPercent = scan.nextInt();

        double cost = 0;
        double totalCost = 0;

        while (cost != -1) {
            System.out.println("Enter the cost in dollars and cents. Type -1 to end.");
            cost = scan.nextDouble();
            totalCost =  totalCost + cost;

        }

        System.out.println("--------------------------------------");
        totalCost ++;
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercent);
        System.out.println("Total tip: " + (totalCost/(tipPercent/.01)));

    }
}
