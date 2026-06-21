# PL/SQL Control Structures - Banking System Scenarios

## Overview

This exercise demonstrates the use of **PL/SQL Control Structures** such as conditional statements (`IF-THEN-ELSE`) and loops in a banking environment. The objective is to automate common banking operations by applying business rules to customer and loan data.

---

## Learning Objectives

Through this exercise, the following PL/SQL concepts are demonstrated:

* Variable Declaration
* Conditional Statements (IF-THEN-ELSE)
* Loops
* Business Rule Implementation
* Decision Making in PL/SQL
* Database-Oriented Programming

---

# Scenario 1: Loan Interest Discount for Senior Citizens

## Problem Statement

The bank wants to provide a special benefit to senior citizens. Customers who are older than 60 years should receive a 1% reduction in their current loan interest rate.

## Business Rule

* If customer age > 60

  * Apply 1% discount to interest rate
* Otherwise

  * Keep the existing interest rate unchanged

## PL/SQL Concepts Used

* Variable Declaration
* IF Statement
* Arithmetic Operations

## Sample Output

```text
Updated Interest Rate: 9%
```

## Outcome

The program successfully identifies eligible senior citizens and automatically updates their loan interest rate according to the bank's policy.

---

# Scenario 2: VIP Customer Identification

## Problem Statement

The bank wants to promote high-value customers to VIP status based on their account balance.

## Business Rule

* If account balance > $10,000

  * Customer becomes VIP
* Otherwise

  * Customer remains a regular customer

## PL/SQL Concepts Used

* IF Statement
* Boolean Decision Logic
* Variable Assignment

## Sample Output

```text
VIP Status: TRUE
```

## Outcome

The program evaluates customer balances and automatically assigns VIP status to eligible customers.

---

# Scenario 3: Loan Payment Reminder System

## Problem Statement

The bank wants to remind customers whose loan payments are due within the next 30 days.

## Business Rule

* If due days ≤ 30

  * Generate reminder message
* Otherwise

  * No reminder is required

## PL/SQL Concepts Used

* Conditional Statements
* Business Rule Validation
* Message Generation

## Sample Output

```text
Reminder: Your loan payment is due within 30 days.
```

## Outcome

The system helps the bank proactively notify customers and reduce the chances of missed loan payments.

---

# Key PL/SQL Concepts Demonstrated

## Variables

Used to store:

* Customer Age
* Account Balance
* Interest Rate
* Loan Due Days

## Conditional Statements

Implemented using:

```sql
IF condition THEN
   statements;
ELSE
   statements;
END IF;
```

These statements allow the program to make decisions based on customer data.

## Loops

PL/SQL loops can be used to process multiple customers efficiently.

Example:

```sql
FOR i IN 1..10 LOOP
   -- Process Customer Records
END LOOP;
```

---

# Business Benefits

* Automation of banking operations
* Reduced manual effort
* Consistent rule enforcement
* Improved customer service
* Faster decision-making process

---

# Conclusion

This exercise demonstrates how PL/SQL control structures can be used to implement real-world banking scenarios. By utilizing variables, conditional statements, and loops, banks can automate customer management, apply business rules efficiently, and improve operational productivity.

---

## Technologies Used

* Oracle PL/SQL
* Oracle Live SQL
* SQL Developer

