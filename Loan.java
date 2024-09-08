import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Loan {
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int loanTerm;
    private double remainingAmount;
    private static final DecimalFormat df;

    static {
        // Define a custom pattern for Indian numbering format
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        df = new DecimalFormat("##,##,##,###.##", symbols);
    }

    public Loan(String loanType, double loanAmount, double interestRate, int loanTerm) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.remainingAmount = calculateTotalAmount();
    }

    // Method to calculate the total amount to be paid
    private double calculateTotalAmount() {
        return loanAmount + (loanAmount * (interestRate / 100) * loanTerm);
    }

    // Method to calculate the minimum monthly installment
    public double calculateMonthlyInstallment() {
        double totalAmount = calculateTotalAmount();
        int totalMonths = loanTerm * 12;
        return totalAmount / totalMonths;
    }

    // Method to make a payment
    public void makePayment(double payment) {
        if (payment >= remainingAmount) {
            remainingAmount = 0;
            System.out.println("Loan fully paid off!");
        } else {
            remainingAmount -= payment;
            System.out.println("Payment successful! Remaining balance: ₹" + df.format(remainingAmount));
        }
    }

    // Method to display loan details
    public void displayLoanDetails() {
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: ₹" + df.format(loanAmount));
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Term: " + loanTerm + " years");
        System.out.println("Remaining Amount: ₹" + df.format(remainingAmount));
        System.out.println("Minimum Monthly Installment: ₹" + df.format(calculateMonthlyInstallment()));
    }

    // Method to check if the loan is paid off
    public boolean isLoanPaidOff() {
        return remainingAmount == 0;
    }
}
