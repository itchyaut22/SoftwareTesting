# Preface : Setting up the Test Environment

Because it was not possible to set up a local Bugzilla server, we decided to give [4.4 branch on landfill](https://landfill.bugzilla.org/bugzilla-4.4-branch/) a chance.

# Assignment Part A: Capture & Replay with Selenium IDE

After having installed Selenium IDE, we recorded the tests step for step as described in the assignment. Concretely, this means we followed the following steps:

  1. Get to the main page of the server
  2. **Assert** that there was no login yet
  3. log in
  4. **Assert** that the login was successful
  5. (choose a classification and a product)
  6. (choose a component of the product)
  7. Submit a new bug with *Summary* and *Description*
  8. **Check** the *Status*, *Summary* and *Description*

Because we considered a bit of a strange thing to mention only one person in the comments, we chose a slightly different format - i.e. *last names*, *group number*, *exercise letter*. The recorded test can be found under `assignment04-Team12-exercise01` as `BugzillaTest.html`.

# Assignment Part B: Running Web Tests as JUnit Tests

Again after some setup, we managed to get the recorded test into a usable `JUnit` test in the `SeleniumTests_12` directory with `Selenium WebDriver`. After having removed some useless methods and imports, the result should look like `BugzillaTest.java` which can be found under `assignment04-Team12-exercise02`.

# Assignment Part C: Page Object Pattern for Web Testing

For the third part of this assignment, we created a total of six `PageObject`s to clean up the existing `JUnit` test. Each of these `PageObjects` provides functionality to interact with each page that appears during the test sequences (and nothing more). Creating the extra tests by means of these `PageObjects` is in the end quite a convenient task and makes it obvious why it does make sense to use this pattern. Together with the `PageFactory`, it is possible to write clean and readable tests. Because comments were graded in a negative way last time, they have been omitted. The resulting tests and `PageObjects` reside under `assignment04-Team12-exercise03` in a project with the same name as in part B of this assignment.

