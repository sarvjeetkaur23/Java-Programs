import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.printf("Future investment value is $%.2f", futureInvestmentValue);
    }
}
