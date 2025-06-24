DECLARE
    CURSOR cust_loan_cursor IS
        SELECT c.CustomerID, c.Age, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID;

BEGIN
    FOR record IN cust_loan_cursor LOOP
        IF record.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = record.LoanID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

