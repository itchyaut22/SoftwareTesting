# Assignment Part A: Random Test Case Generation for RingBuffer

For this part of the assignment, we used *Randoop* as the test case generator. We created test cases for different time spans (1s, 2s, 3s, 4s, 5s, 6s, 7s, 8s, 9s, 10s and 20s). The generated test cases are part of the submission. The randoop output files can be found under the `randoop` folder. In order to distinguish between the different timings, the packages were named `exercise01_[time]s` rather than just `exercise01` (this package has been used for the tests that could be generated in 10 seconds).

For the coverage analysis, we used *JaCoCo*[1] again.

### Question 1 

> Increase the time limit for test generation step by step to, for example, 20 seconds, 30 sec., 60 sec., 120 sec., etc. Measure the code coverage of the generated test cases for each generated set of tests. At what point do you reach the maximum coverage (plateau) where more generation time does not lead to an increase of coverage? What is the maximum coverage?

When performing the previous part of the assignment (generating for 10 seconds), we came to the conclusion that the coverage was already 100% and the mutation coverage was also already 90%. When trying to get a coverage less than 100%, we also noticed that the number of tests that can be generated is strongly dependent on the hardware that is used. Some of us own relatively new computers, whereas one team member happened to own a five year old computer. Because the old computer was the only one that managed to generate tests that did not have full coverage we used this one to generate tests and base the analysis on. This is also the reason why we decided to take a look at what happens in the range 1s - 20s rather than the times that are proposed for this assignment. After all, generating more tests cannot improve a 100% coverage...

The table below summarises the code coverage and mutation score for the different generated tests.

| Time [s] | Code Coverage [%] | Mutation Score [%] | Nr of Tests |
|:--------:| -----------------:| ------------------:| -----------:|
| 01       | 69.1              | 57                 | 107         |
| 02       | 69.1              | 62                 | 176         |
| 03       | 90.6              | 71                 | 223         |
| 04       | 90.6              | 71                 | 261         |
| 05       | 90.6              | 71                 | 296         |
| 06       | 90.6              | 71                 | 323         |
| 07       | 90.6              | 76                 | 355         |
| 08       | 100.0             | 90                 | 438         |
| 09       | 100.0             | 90                 | 480         |
| 10       | 100.0             | 90                 | 526         |
| 20       | 100.0             | 100                | 937         |

From this table it seems that there is no upper bound for the coverage in this case. There seems to be some kind of plateau at 3 seconds, but this is probably just because the time differences are too small, but when increasing the time for randoop, it turns out that the maximum coverage that can be achieved is 100%. Generating tests for longer than 20 seconds does not make sense, because from there on, both the coverage and the mutation score are 100%. Although we might have expected that hundred percent coverage is quasi impossible, it seems reasonable that this is nevertheless possible in such a simple case as the `RingBuffer`.

### Question 2

> Does the achieved coverage and mutation score imply that the tested class is correct? Discuss this question in your group and explain why or why not.

With testing it is never possible to verify that a program is correct. The only thing that we can definitely say, is that the chances for the program to contain mistakes has become pretty small, when coverage **and** mutation score are 100%.

# Assignment Part B: Model-based Testing for RingBuffer

To Include the ModelJUnit library we are using a maven dependency.

## Simple Model

In the first step we created a test model for `RingBuffer`. In this model we override the `getState()` method. This method returns a `String` represention of the states Full, Empty and Filled of the ringbuffer.
We also override the `reset()` method which resets the buffer with a random maximum size between 1 and 10. Afterwards we defined the actions for `enque()` and `deque()` of the buffer. In this Simple Model we also
defined Guards for those methodes to ensure that `enque()` is only called when the buffer is not full and that `dequeue()` is only called when the buffer is not empty.
The results of the model execution can be found in the output folder.

## Model with Adapter

In a second step we adapted the Simple Model. We introduced a counter variable to check if the amount of objects in the ringbuffer is correct. We deleted the guards to also get not allowed transitions which throws exceptions to also test this behaviour.
For the `dequeue()` and `enqueue()` methods we provided assertions to check for right behaviour of the ringbuffer. The results of the model execution can be found in the output folder.

### Failure detection
In order to check if the model would find failures in the ringbuffer as well, we introduced bugs. We tested the model with the following bugs: commenting out incrementation of `N`, commenting out decrementation of `N`, commenting out setting of first, commenting out setting of last.
All these bugs were successfully recognised by the model.

### Code coverage
For the coverage analysis, we used *JaCoCo*[1] again.

First we tested the model with zero testcases and it can be seen that `dequeue()` nor `enqueue()` was executed.
![Coverage Check 0 Test Cases](images/02_0.PNG)

Afterwards we tested the model with one testcases which executes the `dequeue()` method and it can be seen that the `dequeue()` method is not fully covered since only the exception case was executed
![Coverage Check 0 Test Cases](images/02_1.PNG)

Afterwards we tested the model with 5 testcases and it can be seen that `dequeue()` is fully covered while `enque()` is only partially covered since the `enqueue()` method with a full ringbuffer (=exception case) is never executed
![Coverage Check 0 Test Cases](images/02_5.PNG)

Afterwards we tested the model with 20 testcases and it can be seen that both `dequeue()` and `enqueue()` are fully covered. So it does not make sense to make further coverage tests since more test cases cannot increase the coverage.
![Coverage Check 0 Test Cases](images/02_20.PNG)


[1]:
see <http://eclemma.org/jacoco> for further information.
