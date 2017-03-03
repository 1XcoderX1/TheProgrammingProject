# Homework: Lecture 3.

## The first class I made was the Printer:

I did the following:
I used BufferedReader to read the entire line from the text file.
Then I used FileReader to read directly from the text file, which I also created (file.txt), and then I copied the path to the file.txt.
After this, I made a "while" statement: while the line is not null, then it will read the line until the end of it. All of this was inside a try block.
Afterwards, I caugth th exceptions triggerred.
Finally, I made another try block, where i inserted an "if" statement, to check if the "reader" is not null and close it. This action triggerred an exception, so I caught it.

PS: I had to use Google to use the bufferdReader.

### The second class I made was the Cslculator1:

At the beginnig I was a bit confused about how to aproach this exercise. So what I did was:

I assigned three values to be equal to the first three arguments.

Then I converted the strings into doubles (arg [1] and arg[2]). Then I made "if" and "else" statements, to check if the "operation" is equal to "sum"...
And then I just prnted out the solutions depending on the operation.