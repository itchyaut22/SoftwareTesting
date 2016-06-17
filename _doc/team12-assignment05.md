# Assignment Part A: Static Analysis for the RingBuffer

## *PMD*

PMD scans source code in Java and other languages and looks for potential problems like:

+ Possible bugs - empty try/catch/finally/switch statements
+ Dead code - unused local variables, parameters and private methods
+ Suboptimal code - wasteful String/StringBuffer usage
+ Overcomplicated expressions - unnecessary if statements, for loops that could be while loops
+ Duplicate code - copied/pasted code means copied/pasted bugs

For this assignment, we used *PMD* in the version 5.4.2. As PMD depends on rule sets, the output of PMD for the RingBuffer.java class might look different for each group. We used PMD as a command line tool with the following rule sets:

+ java-basic
+ java-design
+ java-unusedcode
+ java-imports
+ java-finalizers
+ java-unnecessary
+ java-naming
+ java-optimizations
+ java-empty
+ java-comments

Using that much rule sets leads to a bunch of found problems. We let PMD generate a HTML-file for a better overview of all the found problems (see Abbildung 01). The full command for generating the PMD reports looks like this:

    ./run.sh pmd -dir /Users/martin/Documents/workspace/SoftwareTesting/
        assignment05-Team12-exercise01/src/team12/RingBuffer.java
        -f html -rulesets java-basic,java-design,java-unusedcode,
        java-imports,java-finalizers,java-unnecessary,java-naming,
        java-optimizations,java-empty, java-comments
        -r result.html

Unfortunately, we have not found any possibility to use all available java rule sets automatically.

![PMD report](images/img01.png)

## *FindBugs*

For Findbugs, we used the [Eclipse plugin](http://findbugs.sourceforge.net/manual/eclipse.html) to do the static analysis.

* Findbugs: 3 bugs
* Findbugs: 2 bugs with rank 8/20 (scary) and 1 bug with rank 12/20 (troubling) NOTE: 1 is highest severity, 20 is lowest severity
* Findbugs: Each of the 3 detected bugs detect the bug that was introduced
* Findbugs: Might be useful to find out why a program does not work and would be ideally used before the program ever runs to avoid the wondering why something went wrong
* The main effort is probably writing the tool, because the plugins are just really easy to use...

## Discussion

### How many violations are detected by PMD and by FindBugs?

### What is the indicated severity of the detected violations (called “priority” or “rank”).

### Are the detected violations real defects, warnings about potential defects or false alarms? (Include examples for the different categories in your answer.)

### Which tool would you use in which situation in a software project?

### What is the effort involved for using static analysis tools?
