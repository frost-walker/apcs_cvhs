
Did the recursion problem on my own, because the old github link (check history)
was shit
I solved it
the only downside is now I gotta ask if probability has anything to do with
time complexity, because the recursion (at least on Windows Subsystem for Linux)
maxes out at around 2000 calls. The average call is between 1000 and 200 though.
Every 50 or so tests it fails, and I see that as an absolute win. 
Started like around March 1, Finished the generator three weeks later 3/20

3/22
The above is false.
What I did was not recursive backtracking. It now has a finite stack.
It was not backtracking because although it was recursive, it never backtracked.
This new process contains a loop that loops through and does stuff until it 
returns true.
The other process was needlessly complicated.


Next Steps: I guess do the shitty Leetcode solver thing. How hard could it be
3/24 Starting the Solver, after a few days of relative inactivity
It should be pretty easy, not aiming for huristics this time and just doing
regular recursive backtracking
It should relatively go on the same process as the Generator class
The key difference is that there will already be numbers in set positions

Main thing being attempted in the solver:
Try to solve a puzzle that has been generated.
It is no use generating a puzzle and randomly removing values when the puzzle
itself turns out to be useless.
Why am I typing in this thing more than actually programming
GOTTA WATCH SOME GEOHOT

3/23 
This is not even a README anymore, don't even know what a readme is
Something about a doc procedure??? (DESIGN DOC)
Stuck in Corona- quarantine so this is sort of a cringy journal

The main recursive function creates a list of options for each box
When making this array it does the normal stuff, checks rows, cols and the boxes
What I was doing wrong last time was not passing THIS SELECTION ARRAY THROUGH 
PROPERLY, making the recursion problem NOT BACKTRACKING.
This new process has a while loop and does something until it returns true. 
It randomly selects the options from the list of options, and keeps going down
the path until it whittles down the list and there are no more options. 
TRUST THE RECURSION...
hopefully I now understand recursion after this.

Journal Entry 3/24
I used VSCode for the first time, not sure how I like it
Discovered I am a boomer, I cannot use anything but vim and bash
Will attempt to learn VSCode, seems kinda fast and cool with GitHub built in. 
How bad could it be?
