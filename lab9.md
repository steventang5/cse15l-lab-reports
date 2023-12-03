**Part 1 - Debugging Scenario**
1) Original post by student  
Title: JUnit Test Failing with ClassNotFoundException
I'm working on running some JUnit tests for my Java class, and I'm running into an error I can't figure out. Every time I try to run my tests, I get a ClassNotFoundException. 
I'm guessing it's something to do with the way I'm compiling or running my tests, but I'm not sure what's wrong. It is not letting me run my tests.
Here's the terminal output when I run my bash script to compile and test:

![image](https://github.com/steventang5/cse15l-lab-reports/assets/146782397/1bf288b3-0d99-4d11-854f-fbdbba5c8e3d)

Does anyone have any idea what might be causing this? Any help would be greatly appreciated!

2) TA Response:  
  It looks like there might be an issue with your file names. Check your file names with what you are compiling with in test.sh.

3) ![image](https://github.com/steventang5/cse15l-lab-reports/assets/146782397/25273727-3e5e-4e04-ba46-596b258b29e8)
The student fixed the bug and now his tests are running correctly.
The bug was the compile and run commands in his bash script used a different name for a file then what the actual file name was. Still an error with his tests.

4) Information
- File Structure:
  - └── lab7
    ├── ListExamples.class
    ├── ListExamples.java
    ├── ListExamplesTests.class
    ├── ListExamplesTests.java
    ├── StringChecker.class
    ├── lib
    │   ├── hamcrest-core-1.3.jar
    │   └── junit-4.13.2.jar
    └── test.sh
- Contents of bugged file before:
  - javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
    java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples
- The full command line (or lines) you ran to trigger the bug
  - bash test.sh
- A description of what to edit to fix the bug
  - Change TestListExamples to the appropiate name: ListExamplesTests

**Part 2 - Reflection**
I learned a lot about vim and how to be faster. 
It thought it was cool that we can edit directly from the command line with no need for the mouse which could improve time taken on tasks. 
Although I think in order to be better at vim I need a lot of practice, I think it is cool but I don't really know if it is worth learning since I don't know how much faster it really is.





