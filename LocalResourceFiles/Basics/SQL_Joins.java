// Table_01                 Table_02
// | id   |                 | id     |
// | 1    |                 | 1      |
// | 1    |                 | 1      |
// | 1    |                 | 2      |
// | 2    |                 | 2      |
// | 3    |                 | 4      |
// | 3    |                 | null   |
// | 3    |
// | null |
 

// In SQL, no null record from one table matches to a null record of any other table
	// In the backend, SQL stores a random garbage value for the null record

// Inner Join
	// Get matching/ same records
	// For every record in left table, if there is a same record in the right table, return the record
	// For the first row value in the left table, there are 2 matching records in the right table - 2 records will be returned
	// Select <select_list> From Table_01 01 Inner Join Table_02 02 On 01.key = 02.key 
// | id   | id     |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 2    | 2      |
// | 2    | 2      |


// Left Join
	// Inner Join + Additional records in left table which are not in right table
// | id   | id     |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 1    | 1      |
// | 2    | 2      |
// | 2    | 2      |
// | 3    | null   |
// | 3    | null   |
// | 3    | null   |
// | null | null   |

// Right Join
	// Opposite of Left Join

// Full Join
	// Inner Join + Additional records in left table which are not in right table + Additional records in right table which are not in left table

// Cross Join
	// Match every record from the left table with every record with the right table
// If we cross join the above tables, we will get (8 * 6 = 48) records

// Self Join = Joining with same tables
	// Self Inner Join, Self Outer Join etc.



