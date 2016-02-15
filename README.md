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


Valid inputs: Any number [2, Integer.MAX_VALUE / 2). The program will give you a warn message if your input is not within the range.

Test cases are:

A basic Naive secret() which returns the input number itself

A few testcases which are addtive all the time, which is AbsSecret, NegPosSecret, PlusMinusSecret. They don't change input values.

A few testcases with mod. They are ModHundredSecret, ModLargeSecret, ModSixSecret.
They will mod the input values in order to change it. So if the mod value = 2000, then values larger/equal than 2000 would be changed by this secret method. So, if x + y >= 2000, it would not work. For those tests, I suggest using large and small Ns for testing. For an example, ModHunredSecret will change the value which is larger than 100, so you should use N=10 to see if it works when N is small, and N = 1000 to see if it doesn't work for large N.
In all, for those 3 test cases, just make sure N is larger than the mod. ModeSixSecret should be larger than 6, ModHundredSecret should be larger than 100, ModLargeSecret should be larger than 10657.(I know in real cases, you only need to input N=60 to see that ModHundredSecret failed, but this is just a defensive testing advice)

**This one is important

Two testcases with changing specific values. For example, ChangeOneNonPrimeSecret only changes a non-prime, which is 100. Thus ChangeOneNonPrimeSecret(100) will not be 100.(I set it to 0) ChangeOnePrimeSecret will change a prime which is 10657.
So for ChangeOneNonPrimeSecret, although we don't have non-prime numbers, but we could have two primes numbers added to 100. For example, 97 + 3. So when N is larger than 100(Again, defensive), ChangeOneNonPrimeSecret should not work. 
For ChangeOnePrimeSecret, since 10657 is large, I suggest using N=20000 and similar numbers to test it. When N is large, this should be non-addtive.

One test case will make things to negative. This should still work all time since it doesn't change the absolute value of the input.  

One test case will change everything to 0, which is the BecameZeroSecret. Since it changes everything to zero, it should work all time.

One test case will change everything to 1, which is the BecameOneSecret. This shouldn't work because secret(x+y)=1, secret(y)+secret(x)=2.



To tweak testcase:
Simply just follow my other testcases. For example, NaiveSecret is one of the test class. You just need to create the same kind of class, write your own secret method in the class, write a test method according to others in SecretTest.java, and execute it in the main class.



