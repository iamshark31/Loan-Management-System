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

