# PL/SQL Stored Procedures - Banking System Automation

## Overview

This exercise demonstrates the implementation of **Stored Procedures in PL/SQL** for automating common banking operations. Stored procedures help improve code reusability, maintainability, security, and performance by storing business logic directly inside the database.

The exercise covers three real-world banking scenarios:

* Monthly Interest Processing
* Employee Bonus Management
* Fund Transfer Between Accounts

---

## Learning Objectives

Through this exercise, the following PL/SQL concepts are demonstrated:

* Stored Procedures
* Parameterized Procedures
* Database Updates
* Conditional Statements
* Business Rule Validation
* Banking Transaction Logic

---

# Scenario 1: Monthly Interest Processing

## Problem Statement

The bank needs to process monthly interest for all savings account holders. Every account should receive a fixed interest rate of 1% on the current balance.

## Business Rule

* Apply 1% interest to every savings account balance.
* Update the account balance automatically.

## Procedure Name

```sql
ProcessMonthlyInterest
```

## Logic

The procedure updates all account balances by increasing them by 1% of their current value.

Formula:

```text
New Balance = Current Balance + (Current Balance × 1%)
```

## Example

Before Interest:

```text
Balance = 10,000
```

After Interest:

```text
Balance = 10,100
```

## Benefits

* Automated monthly processing
* Reduced manual effort
* Accurate interest calculation
* Consistent banking operations

---

# Scenario 2: Employee Bonus Management

## Problem Statement

The bank wants to reward employees by providing performance-based bonuses. The bonus percentage should be provided dynamically and applied only to employees of a specific department.

## Business Rule

* Accept department name as input.
* Accept bonus percentage as input.
* Update salaries of employees belonging to the specified department.

## Procedure Name

```sql
UpdateEmployeeBonus
```

## Parameters

| Parameter        | Description                     |
| ---------------- | ------------------------------- |
| Department       | Department Name                 |
| Bonus Percentage | Percentage of bonus to be added |

## Example

Input:

```text
Department = IT
Bonus = 10%
```

Current Salary:

```text
50,000
```

Updated Salary:

```text
55,000
```

## Benefits

* Flexible bonus allocation
* Department-specific updates
* Reusable procedure
* Easy salary management

---

# Scenario 3: Fund Transfer System

## Problem Statement

Customers should be able to transfer funds between bank accounts while ensuring that sufficient balance is available before completing the transaction.

## Business Rule

* Verify source account balance.
* If balance is sufficient:

  * Deduct amount from source account.
  * Add amount to destination account.
* If balance is insufficient:

  * Cancel transaction.

## Procedure Name

```sql
TransferFunds
```

## Parameters

| Parameter           | Description             |
| ------------------- | ----------------------- |
| Source Account      | Account sending money   |
| Destination Account | Account receiving money |
| Amount              | Transfer amount         |

## Example

Before Transfer:

```text
Account A = 20,000
Account B = 10,000
Transfer Amount = 5,000
```

After Transfer:

```text
Account A = 15,000
Account B = 15,000
```

## Validation

The procedure checks account balance before executing the transfer.

Example:

```text
Balance = 3,000
Transfer Amount = 5,000
```

Output:

```text
Insufficient Balance
```

## Benefits

* Prevents invalid transactions
* Maintains data consistency
* Supports secure banking operations
* Demonstrates transaction-based logic

---

# Key PL/SQL Concepts Demonstrated

## Stored Procedures

A Stored Procedure is a named PL/SQL block stored inside the database and executed whenever required.

Advantages:

* Reusability
* Better Performance
* Improved Security
* Centralized Business Logic

---

## Parameters

The exercise demonstrates procedure parameters:

```text
IN Parameters
```

Used to pass values into a procedure.

Examples:

* Department Name
* Bonus Percentage
* Account Number
* Transfer Amount

---

## Conditional Statements

Implemented using:

```sql
IF condition THEN
   statements;
ELSE
   statements;
END IF;
```

Used for:

* Balance validation
* Decision making
* Transaction approval

---

## Database Updates

The procedures use SQL UPDATE statements to modify:

* Account Balances
* Employee Salaries
* Banking Records

---

# Business Benefits

* Automation of banking operations
* Faster transaction processing
* Reduced human error
* Improved maintainability
* Consistent business rule enforcement

---

# Conclusion

This exercise demonstrates how PL/SQL Stored Procedures can be used to automate critical banking operations. By implementing interest calculation, employee bonus processing, and secure fund transfers, the system improves operational efficiency while ensuring data consistency and business rule compliance.

---

## Technologies Used

* Oracle PL/SQL
* Oracle Live SQL
* SQL Developer


