// Practice Website - https://www.w3schools.com/sql/trysql.asp?filename=trysql_op_in

//1. Task: Select all data from a database table
// SQL Query: SELECT * FROM Customers;

//2. Task: Select CustomerID, ContactName, Country from Customers
// SQL Query: Select CustomerID, ContactName, Country from Customers;

//3. Task: Select all customers who lives in london
// SQL Query: Select * from Customers where City='London';

//4. Task: Order all the data wrt. descending/ ascending order of Country column
// SQL Query: Select * from Customers order by Country DESC;
// SQL Query: Select * from Customers order by Country ASC;

//5. Task: Insert new data into the table
// SQL Query: Insert Into Customers values(92,'My Name','My Contact Name','My Company','My Company Address',123456,'My Country');

//6. Task: Update pre existing record
// SQL Query: UPDATE Customers SET ContactName = 'New Name', City= 'New City' WHERE CustomerID = 1;

//7. Task: Delete a Customer details from Customers table whose CustomerId = 1 
// SQL Query: Delete from Customers where CustomerID=1;

//8. Task: Delete complete table
// SQL Query: Delete from Customers;

//9. Task: Get a set of distinct countries from the table
// SQL Query: SELECT DISTINCT(Country) FROM Customers;

//10. Task: Get number of customers living in Germany
// SQL Query: SELECT COUNT(*) FROM Customers WHERE Country = "Germany";

//11. Task: Get Maximum, Minimum, Average Price in Products
// SQL Query: SELECT Max(Price), Min(Price), Avg(Price) FROM Products;

//12. Task: Get ProductName where Price is between 10 and 15
// SQL Query: SELECT ProductName FROM Products WHERE Price BETWEEN 10 AND 15;

//13. Task: Get the customers who are living in Country UK and/ or City London
// SQL Query: SELECT * FROM Customers WHERE Country = "UK" AND City = "London";
// SQL Query: SELECT * FROM Customers WHERE Country = "UK" OR City = "London";

//14. Task: Get the customers who are not living in London
// SQL Query: SELECT * FROM Customers WHERE NOT City = "London";

//15. Task: Get the total salary of each employee adding the Salary with Variable Pay
// SQL Query: SELECT EmpId, Salary + VariablePay as TotalSalary FROM Employee;

//16. Task: Get the complete address of each customer adding the Address, City and Country [Concat strings]
// SQL Query: SELECT CustomerName || ' ' || Address || ' ' || City || ' ' || + Country as CompleteAddress FROM Customers;

//17. Task: [Add numbers]
// SQL Query: SELECT AnyColumn1, IntColumn1 + IntColumn2 as NewIntColumnName FROM TableName;

//18. Task: Get the total Customers whose City is NULL
// SQL Query: SELECT * FROM Customers WHERE City is NULL;

//19. Task: Get the Products where the SupplierID = 6 and Price > 10
// SQL Query: SELECT * FROM Products WHERE SupplierID = 6 AND Price > 10;

//20. Task: How many Customers are there in each Country
// SQL Query: SELECT Country, COUNT(*) FROM Customers GROUP BY Country;

//21. Task: Get all the Country where at least 10 Customers are present
// SQL Query: SELECT Country, COUNT(*) FROM Customers GROUP BY Country HAVING COUNT(*) >= 10;

//22. Task: Get the ProductName which has the highest Price
// SQL Query: SELECT ProductName FROM Products WHERE Price = (SELECT MAX(Price) FROM Products);

//23. Task: Get the ProductName which has the second highest Price
// SQL Query: SELECT MAX(ProductName) FROM Products WHERE Price < (SELECT MAX(Price) FROM Products);

//24. Task: Get all the EmployeeID who have ordered ProductID = 42
// SQL Query: SELECT EmployeeID FROM Orders WHERE OrderID IN (SELECT OrderID FROM OrderDetails WHERE ProductID = 42);

//25. Task: Delete duplicate rows from the table
// Approach:
	// 1. Create a temp table with all distinct rows
	// 2. Delete data from original table
	// 3. Copy data of temp table to the original table
// SQL Query:
	// Create Table Customers_Temp as SELECT DISTINCT * FROM Customers;
	// Delete from Customers;
	// Insert Into Customers Select * From Customers_Temp;
	// Delete from Customers_Temp;
	// Select * From Customers;

//26. Task: Get current date
// SQL Query - MySQL : Select Now();
// SQL Query - SQL Server : Select getdate();

//27. Task: Select SampleColumn data which is in Table01 but not in Table02
// SQL Query: Select SampleColumn from Table01 Minus SampleColumn from Table02;

//28. Task: Select SampleColumn data which is in Table01 and in Table02
// SQL Query: Select SampleColumn from Table01 Intersect SampleColumn from Table02;

//29. Task: Select SampleColumn data which is either in Table01 or in Table02 [With Duplication]
// SQL Query: Select SampleColumn from Table01 Union All SampleColumn from Table02;

//30. Task: Select SampleColumn data which is either in Table01 or in Table02 [Without Duplication]
// SQL Query: Select SampleColumn from Table01 Union SampleColumn from Table02;