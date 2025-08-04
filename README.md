# Java Scanner Utility ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

This repository provides a simple and elegant example of using the Java `Scanner` class to handle user input from the console and from files. The `Scanner` class is a fundamental part of Java's standard library and is widely used for reading and parsing different types of input in Java applications.

## Features

- Read input from the console (keyboard)
- Read data from files
- Parse integers, doubles, strings, and other data types
- Simple, clean, and reusable code examples

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or above
- (Optional) An IDE such as IntelliJ IDEA, Eclipse, or VS Code

### How to Run

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/java-scanner-utility.git
   cd java-scanner-utility
   ```

2. **Compile the Java Classes**

   ```bash
   javac *.java
   ```

3. **Run the Main Class**

   ```bash
   java Main
   ```

   *(Replace `Main` with the actual main class if different.)*

## Example Usage

### 1. Reading from the Console

```java
import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
```

### 2. Reading from a File

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileInputExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
```

## Best Practices

- Always close your `Scanner` object after use to free system resources.
- Handle exceptions such as `FileNotFoundException` when reading from files.
- Use appropriate parsing methods (`nextInt()`, `nextDouble()`, `nextLine()`, etc.) based on your input type.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy Coding! 🚀
