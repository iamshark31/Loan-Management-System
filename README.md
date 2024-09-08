# Loan Management System

## Overview
This Loan Management System is a Java-based application designed to manage loans. It supports various types of loans and allows users to perform operations like making payments, viewing loan details, and checking loan status. The system also includes eligibility checks based on user input.

## Features
- **Loan Types**: Supports Home, Car, Gold, and Personal loans.
- **Eligibility Check**: Verifies user eligibility based on salary and, for Gold loans, gold value.
- **Loan Management**: 
  - Calculate and display total loan amount, minimum monthly installment, and remaining balance.
  - Make payments and update the remaining loan amount.
  - Display loan details and check if the loan is fully paid off.

## Files
- **Loan.java**: Contains the `Loan` class with methods to calculate total amount, monthly installment, and handle payments.
- **LoanManagementSystem.java**: Provides methods to check loan eligibility based on type and user input.
- **Main.java**: The entry point of the application that interacts with the user, allowing them to select loan type, input loan details, and perform various operations.

## How to Run
1. Ensure you have JDK installed on your machine.
2. Compile the Java files:
   ```bash
   javac Loan.java LoanManagementSystem.java Main.java
3.  Run the application:
    ```bash
    java Main

4. Follow the on-screen instructions to interact with the Loan Management System.

Sample Output
---------------
Enter your monthly salary (₹): 60000

Select Loan Type:
1. Home
2. Car
3. Gold
4. Personal
2

Enter loan amount (₹): 2000000
Enter interest rate (%): 8
Enter loan term (in years): 5

You are eligible for a Car loan.

Choose an operation:
1. Make a Payment
2. Display Loan Details
3. Check Loan Status
4. Exit
1
Enter payment amount (₹): 50000
Payment successful! Remaining balance: ₹19,50,000

Choose an operation:
1. Make a Payment
2. Display Loan Details
3. Check Loan Status
4. Exit
2
Loan Type: Car
Loan Amount: ₹20,00,000
Interest Rate: 8.0%
Loan Term: 5 years
Remaining Amount: ₹19,50,000
Minimum Monthly Installment: ₹40,000

Choose an operation:
1. Make a Payment
2. Display Loan Details
3. Check Loan Status
4. Exit
3
Loan is still active.

Choose an operation:
1. Make a Payment
2. Display Loan Details
3. Check Loan Status
4. Exit
4
Exiting...

Contact:
For any feedback or questions please reach out to farazsyed261@gmail.com 