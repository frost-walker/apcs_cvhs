log about the generator
copied the solution from github, it didn't even work
essentially solved the problem
I solved it
the only downside is now I gotta ask if probability has anything to do with
time complexity, because the recursion (at least on Windows Subsystem for Linux)
maxes out at around 2000 calls. The average call is between 1000 and 200 though.
Every 50 or so tests it fails, and I see that as an absolute win. 
Started like around March 1, Finished the generator three weeks later 3/20

3/22
The above is false.
Generator1 is the finished recursive generator
What I did was not recursive backtracking. It now has a finite stack.
It was not backtracking because although it was recursive, it never backtracked.
This new process contains a loop that loops through and does stuff until it 
returns true.
The other process was needlessly complicated.