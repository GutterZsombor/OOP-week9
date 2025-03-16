# Week 9 Java Maven Project

This is a Java Maven project named **week9**. It serves as a template for building a Java application using the Maven build system.

## Project Structure

The project is organized as follows:

```
week9
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   │       └── application.properties
│   ├── test
│       ├── java
│       │   └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Getting Started

To get started with this project, follow these steps:

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd week9
   ```

2. **Build the project**:
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using the following command:
   ```
   mvn exec:java -Dexec.mainClass="App"
   ```

## Configuration

The application configuration can be found in the `src/main/resources/application.properties` file. You can modify the key-value pairs to suit your application's needs.

## Testing

Unit tests for the application are located in the `src/test/java/AppTest.java` file. You can run the tests using:
```
mvn test
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.