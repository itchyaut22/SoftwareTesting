# Assignment Part A: Static Analysis for the RingBuffer

For Findbugs, we used the [Eclipse plugin](http://findbugs.sourceforge.net/manual/eclipse.html) to do the static analysis.

* Findbugs: 3 bugs
* Findbugs: 2 bugs with rank 8/20 (scary) and 1 bug with rank 12/20 (troubling) NOTE: 1 is highest severity, 20 is lowest severity
* Findbugs: Each of the 3 detected bugs detect the bug that was introduced
* Findbugs: Might be useful to find out why a program does not work and would be ideally used before the program ever runs to avoid the wondering why something went wrong
* The main effort is probably writing the tool, because the plugins are just really easy to use...
