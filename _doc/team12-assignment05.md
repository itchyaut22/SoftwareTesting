# Assignment Part A: Static Analysis for the RingBuffer

## *PMD*

./run.sh pmd -dir /Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java -f text -rulesets java-basic,java-design,java-unusedcode

RingBuffer.java:24:  Avoid unused constructor parameters such as 'capacity'.


dyn-eduroam184238:bin martin$ ./run.sh pmd -dir /Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java -f text -rulesets java-basic,java-design,java-unusedcode,java-imports,java-finalizers,java-unnecessary,java-naming,java-optimizations,java-empty

/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:17:   Generics names should be a one letter long and upper case.
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:18:   Avoid variables with short names like a
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:19:   Avoid using redundant field initializer for 'N'
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:19:   Avoid variables with short names like N
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:19:   The field name indicates a constant but its modifiers do not
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:19:   Variables should start with a lowercase character, 'N' starts with uppercase character.
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:20:   Avoid using redundant field initializer for 'first'
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:21:   Avoid using redundant field initializer for 'last'
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:24:   Avoid unused constructor parameters such as 'capacity'.
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:24:   Parameter 'capacity' is not assigned and could be declared final
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:31:   Parameter 'item' is not assigned and could be declared final
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:41:   Local variable 'item' could be declared final
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:52:   Avoid using redundant field initializer for 'i'
/Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java:52:   Avoid variables with short names like i


./run.sh pmd -dir /Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java -f text -rulesets java-basic,java-design,java-unusedcode,java-imports,java-finalizers,java-unnecessary,java-naming,java-optimizations,java-empty,java-comments


/Users/martin/Downloads/pmd-bin-5.4.2/bin

./run.sh pmd -dir /Users/martin/Documents/workspace/SoftwareTesting/assignment05-Team12-exercise01/src/team12/RingBuffer.java -f html -rulesets java-basic,java-design,java-unusedcode,java-imports,java-finalizers,java-unnecessary,java-naming,java-optimizations,java-empty,java-comments -r result.html

## *FindBugs*

## Discussion

### How many violations are detected by PMD and by FindBugs?

### What is the indicated severity of the detected violations (called “priority” or “rank”).

### Are the detected violations real defects, warnings about potential defects or false alarms? (Include examples for the different categories in your answer.)

### Which tool would you use in which situation in a software project?

### What is the effort involved for using static analysis tools?
