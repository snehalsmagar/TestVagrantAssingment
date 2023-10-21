Step by Step explainaion of Assignment Solution:

Here for the reference of sound pattern I have created a String Array of length 3 with three strings as following (s1, s2, s3).
In order to accept a new song and fit it inside the pattern I have used the Scanner class here, I have first created the scanner class object and 
passed a string to indicate where one should write the new song name.
Since all the strings in patternt have a unique structure, I have added an IF condition for program to locate if the input value
folows the same structure or not.
Once that condition is saticfied, the script inside will reset the pattern with swapping the index 0 position string with 
index 1 position string, index 1 position string with index 2 position and the index 2 position string with the new input keeping the length same
Once the IF condition block is over, the program will print the new Array Pattern as String in console.
Now in order to repeat this process of adding new inputs I have added this entire block of code inside a While loop, which will keep on
running till I terminate the code.
For loop to Not repeat the same structure again and again for any new input, I have moved the Array outside the While Loop.

Working and Tests:

I have a created another seperate class with Main function to run and test this code.
We have to first call the function by creating object of the class and run it,
Once we run the code, the set String message will appear inside the console asking to enter a new value.
Now if we want to see what the current pattern is, we can siply do this by entering any String that doesn't contain "s", as specified in the IF condition.
If we want to see the new pattern, enter the name of new song with same structure as earlier songs i.e. s4,s5,s6,etc. and 
it will get added in the array keeping the length same and following the last two Song names in earlier pattern.
