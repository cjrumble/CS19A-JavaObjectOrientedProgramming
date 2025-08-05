/*
 * Rewrite the if statement below so that the statements on LINE 2 and LINE 3 are swapped and the condition on LINE 1 is altered appropriately so the code gives the same results as before. That means your new condition will be logically the negation of the original condition.  Use basic logic to come up with the simplest possible condition. Do not add any code before or after your modified if statement.

if (!(age>22) || (!homeOwner || !employed) && creditScore<700) // LINE 1
	loanAmount = 10000;   						// LINE 2
else 
	loanAmount = 20000;   						// LINE 3

 */

if (age <= 22 && (homeOwner && employed || creditScore >= 700)) // LINE 1
    loanAmount = 20000;   						// LINE 2
else
    loanAmount = 10000;   						// LINE 3
