# Flight Search Application QA Tests

This project includes some basic test cases on a specific web application. The project is developed using [IntelliJ IDEA](https://www.jetbrains.com/idea/) and has the following Maven dependencies:



    <!-- Webdriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.6.2</version>
    </dependency>

    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.15.0</version>
    </dependency>

### Project Setup

- Clone or download this project.
- Update Maven dependencies.

#### Test Script
**Script 1: Same Value Test in "From" and "To" Fields**
*This script verifies that the same value cannot be entered in the "From" and "To" fields.*

1. ``Test Case:`` The same city name is entered in the "From" and "To" fields.
2. ``Expected Result:`` The application does not accept this situation and displays an error message.

**Script 2: Flight Listing Test**  
*This scenario verifies that flights are listed correctly for a given city pair.*

1. ``Test Status:`` "From: Istanbul" and "To: Los Angeles" are selected.
2. ``Expected Result:`` Two flights are listed.

**Script 3: Number of Listings Test**
*This scenario verifies that the number X in "Found X items" matches the number of flights listed.*

1. ``Test Status:`` Flights listed.
2. ``Expected Result:`` The number X in "Found X items" matches the actual number of flights.
### Running Tests
To run the tests, follow these steps:

- Open the project in IntelliJ IDEA.
- Find the test class: Find the test class in the appropriate package under src/test/java.
- Right click and select "Run".
These steps are enough to let you run the specified test cases and see the results.
