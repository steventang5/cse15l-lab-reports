**Step 4 - Log into ieng6**

<img width="670" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/77110464-ef71-49d1-902d-b3ace04861a4">

Keys pressed: `<up><up><enter>` The `ssh cs15lfa23pd@ieng6.ucsd.edu` command was 2 up the search history so I used up arrow to access it. 
I ran `ssh cs15lfa23pd@ieng6.ucsd.edu` to log into ieng6.

**Step 5 - Clone your fork of the repository from your Github account (using the SSH URL)**

<img width="539" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/75db9d1c-7614-4ac3-b8fc-3ac0b1963ff3">

Keys pressed: `<command-c>` `git clone <command-v><enter>` I copied the ssh key from github for lab7 and typed out git clone in the terminal and pasted the key. 
I ran `git clone git@github.com:steventang5/lab7.git` to clone the fork of my repository from my github account into ieng6.

**Step 6 - Run the tests, demonstrating that they fail**

<img width="593" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/08374f0f-5e8f-4018-aa32-71032376dec5">

Keys pressed: `cd l<tab><enter>` `ls<enter> bash test.sh<enter>` I typed `cd l` and used `<tab>` to autocomplete it to `lab7/`.
I ran `cd lab7/` to change my working directory to `./lab7`.
I ran `ls` to list all files in current working directory.
I ran `bash test.sh` to run the tests provided.

**Step 7 - Edit the code file to fix the failing test**

<img width="397" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/fbaa88e9-8833-42a4-a997-97bbf618c71d">
<img width="574" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/0fcd8ae7-9db2-4cfa-b140-ed28063cfeb6">

Keys pressed: `vim L<tab>.java<enter>` `jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjlllllllllllr2:wq<enter>` I used `<tab>` to autocomplete `ListExamples.java`
I ran `vim ListExamples.java` to enter vim to edit the code to fix the failing test
I used j to move down to the line with the bug and l to move right to the exact spot with the error. I then pressed r and 2 to replace the 1 in index1 to 2.

**Step 8 - Run the tests, demonstrating that they now succeed**

<img width="329" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/a4cb1e7b-53b2-4093-9743-548193f839ae">

Keys pressed: `bash test.sh<enter>` 
I ran bast test.sh to run the tests again but this time showing they succeed.

**Step 9 - Commit and push the resulting change to your Github account**

<img width="571" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/2b211212-ce5d-4286-a93a-ffa1366ab55c">

Keys pressed: `git add L<tab>.java<enter>` `git commit -m "Fixed bugs in ListExamples.java"<enter>` `git push<enter>` I used `tab` to autcomplete `ListExamples.java`
I ran `git add ListExamples.java` to add the changes to that file to the staging area.
I ran `git commit -m "Fixed bugs in ListExamples.java"` to commit the changes in the staging area with message "Fixed bugs in ListExamples.java"
I ran `git push` to push the changes to my github account.








