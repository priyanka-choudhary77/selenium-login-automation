# selenium-login-automation


## Prerequisites

Before running the tests, ensure that you have the following installed:

- **Java 11 or higher**
- **Maven 3.6+** for managing dependencies
- **ChromeDriver**: Make sure you have the correct version of ChromeDriver for your browser version. Download it from [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/).

## Installation

1. Clone the repository:
    ```bash
    git clone [https://github.com/priyanka-choudhary77]
    cd selenium-basics
    ```

2. Install dependencies with Maven:
    ```bash
    mvn install
    ```

   This will download all required dependencies like Selenium, TestNG, and others specified in `pom.xml`.

3. **Set up ChromeDriver**:
    - Ensure **ChromeDriver** is in your system's PATH or update the `pom.xml` or your test code to point to its location.

## Running Tests

1. **Via Maven**:
   To run the tests using Maven, execute the following command:
    ```bash
    mvn test
    ```

2. **Using TestNG**:
   Alternatively, you can run the tests using **TestNG** by executing:
    ```bash
    mvn clean test -DsuiteXmlFile=testng.xml
    ```

   The `testng.xml` file defines the suite configuration, including which tests to run.

## Project Details

- **Pages**: Contains the Page Object Model (POM) classes that represent different pages of the application under test.
    - Example: `LoginPage.java` defines the login page elements and actions.

- **Tests**: Contains TestNG test classes that include various test scenarios like valid/invalid login.
    - Example: `LoginTest.java` contains tests to validate the login functionality.

## How to Contribute

Feel free to fork the repository and submit pull requests. Here are a few ways you can contribute:
- Improve test coverage.
- Add more page object classes for other pages.
- Enhance the framework by adding features like parallel test execution, custom reporting, or integrating with CI tools like Jenkins.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Troubleshooting

If you encounter any issues while running the tests, consider the following:
- Make sure that your **ChromeDriver** version matches your browser version.
- Ensure that **Java** and **Maven** are installed and configured correctly on your system.

For any other issues or questions, feel free to open an issue in this repository.

