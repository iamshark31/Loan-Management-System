public class LoanManagementSystem {

    // Method to check eligibility
    public static boolean checkEligibility(String loanType, double salary, double goldValue) {
        switch (loanType) {
            case "Home":
                return salary >= 50000;
            case "Car":
                return salary >= 30000;
            case "Gold":
                return goldValue >= 100000;
            case "Personal":
                return salary >= 20000;
            default:
                return false;
        }
    }
}
