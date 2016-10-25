# Problem-Solving-in-Java

#Coding Practice
If anyone wants to build skill in running, he/she needs to run.
To build skill in code, we need to write code. 

In this repo, I am trying to concentrate on the coding with nothing else to get in the way.
Anyone can get a lot of coding practice done in just an hour or two.
I'm conscious that the problems do not have realistic stories to motivate what's going on.
Instead, they are stripped down to have short problem descriptions with little ambiguity.
It's just about lots of little problems to practice.

The problem statements are found in different open source coding practice sites. Example: codingbat.com, coderbyte.com
These problem statements are for my coding practice purpose. 

#Example Problems:
##Factorial !
Using the Java language,have the function take the num parameter being passed and return the factorial of it (e.g. if num = 4,
return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 10.
Sample Test Cases
````
Input:4
Output:24

Input:8
Output:40320
````

##Letter Change:
Using the Java language, have the function **LetterChanges(str)**
take the str parameter being passed and modify
it using the following algorithm.
Replace every letter in the string with the letter
following it in the alphabet (ie. c becomes d, z becomes a).
Then capitalize every vowel in this new string (a, e, i, o, u)
and finally return this modified string.

Sample Test Cases
````
Input:"hello*3"
Output:"Ifmmp*3"

Input:"fun times!"
Output:"gvO Ujnft!"
````

##Reverse String:
You are going to be given a string. Your job is to return that string in a certain order that is explained below:
Let's say you start with this: 012345
The first thing program do is reverse it:543210
Then you will take the string from the 1st position and reverse it again:501234
Then you will take the string from the 2nd position and reverse it again:504321
Then you will take the string from the 3rd position and reverse it again:504123
Continue this pattern until you have done every single position, and then you will return the string you have created. For this particular number, you would return:504132

##Map Pairs:
Given an array of non-empty strings, create and return a Map<String, String> as follows:
For each string add its first character as a key with its last character as the value.
````
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}
````
##Make Bricks
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.
Sample Input and output

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
    makeBricks(20, 0, 19) → true