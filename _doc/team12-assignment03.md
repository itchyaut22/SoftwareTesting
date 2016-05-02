# Assignment Part A: Random Test Case Generation for RingBuffer

For this part of the assignment, we used *Randoop* as the test case generator. We created test cases for different time spans (10s, 30s, 60s, 120s, 240s, 300s and 360s). The generated test cases are part of the submission. The randoop output files can be found under the `randoop` folder.

For the coverage analysis, we used *JaCoCo*[^1] again.

## Question 1: Increase the time limit for test generation step by step to, for example, 20 seconds, 30 sec., 60 sec., 120 sec., etc. Measure the code coverage of the generated test cases for each generated set of tests. At what point do you reach the maximum coverage (plateau) where more generation time does not lead to an increase of coverage? What is the maximum coverage?

The following table shows the results for the coverage[^2] -, as well as the mutation analysis:

| Time [s] | Code Coverage [%] | Mutation Score  | Total Instructions |
|---------:|------------------:|-----------------:|------------------:|
| 10       | 85.9              |                  | 159.859           |
| 30       | 87.9              |                  | 434.482           |
| 60       | 88.9              |                  | 783.883           |
| 120      | 89.6              |                  | 1.259.428         |
| 240      | 90.4              |                  | 2.334.648         |
| 300      | 90.6              |                  | 2.703.000         |
| 360      | 90.9              |                  | 3.363.333         |
| 500      | 91.1              |                  | 4.358.351         |
| 700      | 91.4              |                  | 5.496.704         |
| 900      | 91.6              |                  | 6.958.180         |
| 1200      |             |                  |          |
| 1800      |               |                  |          |

todo

## Question 2: Does the achieved coverage and mutation score imply that the tested class is correct? Discuss this question in your group and explain why or why not.

to be discussed

# Assignment Part B: Model-based Testing for RingBuffer

[^1]:
see <http://eclemma.org/jacoco> for further information.
[^2]:
in percent of the respective package, not for the overall project