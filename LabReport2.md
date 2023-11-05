**Part 1**
<img width="1512" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/439ee106-49b7-497f-b3e8-6150cadebc97">
<img width="1512" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/13363898-72cc-4aa6-8292-319e1dc4b8b8">

Which methods in your code are called?
- handleRequest(URI url)

What are the relevant arguments to those methods, and the values of any relevant fields of the class?
- Argument to handleRequest: The URI object representing the URL http://localhost:PORT/add-message?s=HelloWorld.
- Relevant fields before the request:
  - num is 1
  - messages is "" (an empty string)
 
How do the values of any relevant fields of the class change from this specific request?
- num changes from 1 to 2 because of num++.
- messages changes from "" (empty string) to "1. HelloWorld\n" due to messages += num + ". " + parameters[1] + "\n";.

**Part 2**
<img width="531" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/cd637516-493f-4c77-bd39-e4120c415a13">
<img width="287" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/dcb8401a-fe7b-44b2-a509-ec82eb94f95e">
<img width="567" alt="image" src="https://github.com/steventang5/cse15l-lab-reports/assets/146782397/2ca1a0f9-1c21-4df6-b9b7-363dff9abd5b">

**Part 3**
I learned about ssh and servers. I knew you could do stuff like connect to other computers and host servers on your own but I didn't know how it worked, in the past weeks I learned that.





