# ISEP TP4: TDD and BDD

Three Java exercises:

- **Prime Checker:** check if a number is prime.
- **FizzBuzz:** return Fizz, Buzz, FizzBuzz, or the number as a string.
- **Roman Numerals:** convert integers to Roman numerals using BDD and Cucumber.

## Run tests

Use JDK 17. Open the root `pom.xml` in IntelliJ IDEA as a Maven project.

Or run in PowerShell with `JAVA_HOME` set to your JDK folder:

```powershell
.\mvnw.cmd -fae test
```

## Current step: Red

Each exercise has one test:

- 0 is not prime.
- FizzBuzz returns "1" for 1.
- 1 becomes "I" in Roman numerals.

The tests fail because the methods are not implemented yet.
Next, add the minimum code to pass the tests (Green), then refactor if needed (Blue).
