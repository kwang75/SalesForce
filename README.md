# SalesForce Test
This is the repo for SalesForce test


To Execute: 
1. Please download every source code in this repo to the same directory.

2. Go to command line, cd to that directory. 

3. Compile(I'm assuming you have Java7. If not, here is it: http://www.oracle.com/technetwork/java/javase/downloads/jre7-downloads-1880261.html

4. Here is the command of compilation: javac SecretTest.java

5. Test. Simply type javac SecretTest N; (N is the largest prime number of either x or y), and watch for the print message in command line.


The logic:
This repo simply contains 4 things: Validator, Tester, Interface, Class implements that interface. There is more detailed description in their own java files.


Valid inputs: Any number [2, Integer.MAX_VALUE).

Test cases are:
A basic Naive secret() which returns the input number itselft

A few testcases which are addtive all the time. They don't change input values.

A few testcases with mod. They will mod the input values in order to change it. So if the mod value = 2000, then values larger/equal than 2000 would be changed by this secret method. So, if x + y >= 2000, it would not work. 

A few testcases with changing specific values. For example, the secret() only changes a prime, or a non-prime. If it only changes a prime, it should not work; if it changes a non-prime, it should work. 

One test case will make things to negative. This should still work.

One test case that will change the value to 0 if input = 100(non-prime)

One test case will change value to 0 if input = 10657(a prime number)

One test case will change everything to 0, one will change everything to 1.



To tweak testcase:
Simply just follow my other testcases. For example, NaiveSecret is one of the test class. You just need to create the same kind of class, write your own secret method in the class, write a test method according to others in SecretTest.java, and execute it in the main class.



