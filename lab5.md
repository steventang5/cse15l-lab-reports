**Part 1 - Bugs **
- A failure-inducing input for the buggy program, as a JUnit test
```
  @Test
  public void testReversed2() {
    int[] input1 = {10,7,5,3};
    assertArrayEquals(new int[]{3,5,7,10},  ArrayExamples.reversed(input1));
  }
```

- An input that doesn't induce a failure, as a JUnit test
```
@Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```

- The symptom, as the output of running the tests (provided as a screenshot of running JUnit with at least the two inputs above)
<img width="700" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/dd93dd53-55aa-478b-b52c-b4e327e70e53">

- The bug, as the before-and-after code change required to fix it
  - Before
    ```
    static int[] reversed(int[] arr) {
      int[] newArray = new int[arr.length];
      for(int i = 0; i < arr.length; i += 1) {
        arr[i] = newArray[arr.length - i - 1];
      }
      return arr;
    }
    ```
  - After
    ```
    static int[] reversed(int[] arr) {
      int[] newArray = new int[arr.length];
      for(int i = 0; i < arr.length; i += 1) {
        newArray[i] = arr[arr.length - i - 1];
      }
      return newArray;
    }
    ```

- The fix addresses the issue because before it was updating arr with elements from newArray which was newly made so all 0s and then returing arr which is now an array of all 0s. I fixed it by updating newArray with the elements of arr and returning newArray. This fixes it because it now does what it is supposed to do return a new array with all elements of the input array in reverse order.

** Part 2 - Researching Commands **
grep
- Find everything but this (-v)
  - This one is finding all instances of the files that don't have .txt it is useful if you want to see everything you don't need.
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -v ".txt" find-results.txt
    technical
    technical/government
    technical/government/About_LSC
    technical/government/Env_Prot_Agen
    technical/government/Alcohol_Problems
    technical/government/Gen_Account_Office
    technical/government/Post_Rate_Comm
    technical/government/Media
    technical/plos
    technical/biomed
    technical/911report
    steventang@Stevens-MacBook-Pro-5 docsearch % 
    ```
  - For this one, I am excluding everything containing "biomed", this would be useful if I wanted to look at all non-biomed files.
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -v "biomed" find-results.txt
    technical
    technical/government
    technical/government/About_LSC
    technical/government/About_LSC/LegalServCorp_v_VelazquezSyllabus.txt
    technical/government/About_LSC/Progress_report.txt
    technical/government/About_LSC/Strategic_report.txt
    technical/government/About_LSC/Comments_on_semiannual.txt
    technical/government/About_LSC/Special_report_to_congress.txt
    ...
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
- Before and After(-B & -A)
  - This one lets me see 2 lines before my intended search target, this is useful so I can see what is around my target. 
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -B 2  "chapter-3" find-results.txt
    technical/911report/chapter-13.2.txt
    technical/911report/chapter-13.3.txt
    technical/911report/chapter-3.txt
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
  -  This one lets me see 2 lines after my intended search target, this is useful so I can see what is around my target. 
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -A 2  "chapter-3" find-results.txt
    technical/911report/chapter-3.txt
    technical/911report/chapter-2.txt
    technical/911report/chapter-1.txt
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
- Counting (-c)
  - This one counts all instances of a certain target, we could use this to count instead of wc like earlier in the lab, it is useful for knowing how many times the target appears. 
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -c  ".txt" find-results.txt
    1391
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
  - This one counts all the government files, it is useful to know how many of the target string you are trying to find are in the file.
  - ```
    grep -c  "government" find-results.txt
    292
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
- Display line number of match (-n)
  - This one tells you what line the "diversity" was on, this is useful to locate the exact location of any "diversity" files. 
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -n  "diversity" find-results.txt
    14:technical/government/About_LSC/diversity_priorities.txt
    steventang@Stevens-MacBook-Pro-5 docsearch %
    ```
  - This one tells you what line the "chapter-13.4" was on, this is useful to locate the exact location of any "chapter-13.4" files. 
  - ```
    steventang@Stevens-MacBook-Pro-5 docsearch % grep -n  "chapter-13.4" find-results.txt
    1386:technical/911report/chapter-13.4.txt
    steventang@Stevens-MacBook-Pro-5 docsearch % 
    ```

Citation:
- I used chatgpt to find useful command line options for grep
- My prompt was Can you show me interesting command line options or alternate ways to use the command: grep?
- It outputted a lot of command line options for grep and I chose the ones I thought were the most intresting and useful.


   
