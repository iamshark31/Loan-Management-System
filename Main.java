import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.print("Enter your monthly salary (₹): ");
            double salary = scanner.nextDouble();

            System.out.println("Select Loan Type: ");
            System.out.println("1. Home");
            System.out.println("2. Car");
            System.out.println("3. Gold");
            System.out.println("4. Personal");
            int loanChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            String loanType = "";
            switch (loanChoice) {
                case 1: loanType = "Home"; break;
                case 2: loanType = "Car"; break;
                case 3: loanType = "Gold"; break;
                case 4: loanType = "Personal"; break;
                default: System.out.println("Invalid choice! Exiting."); return;
            }

            double goldValue = 0;
            if (loanType.equals("Gold")) {
                System.out.print("Enter the value of your gold (₹): ");
                goldValue = scanner.nextDouble();
            }

            // Check eligibility
            if (!LoanManagementSystem.checkEligibility(loanType, salary, goldValue)) {
                System.out.println("You are not eligible for a " + loanType + " loan.");
                return;
            } else {
                System.out.println("You are eligible for a " + loanType + " loan.");
            }

            System.out.print("Enter loan amount (₹): ");
            double loanAmount = scanner.nextDouble();
            System.out.print("Enter interest rate (%): ");
            double interestRate = scanner.nextDouble();
            System.out.print("Enter loan term (in years): ");
            int loanTerm = scanner.nextInt();

            Loan loan = new Loan(loanType, loanAmount, interestRate, loanTerm);

            // User menu
            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Make a Payment");
                System.out.println("2. Display Loan Details");
                System.out.println("3. Check Loan Status");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter payment amount (₹): ");
                        double payment = scanner.nextDouble();
                        loan.makePayment(payment);
                        break;

                    case 2:
                        loan.displayLoanDetails();
                        break;

                    case 3:
                        if (loan.isLoanPaidOff()) {
                            System.out.println("Loan is fully paid off.");
                        } else {
                            System.out.println("Loan is still active.");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
