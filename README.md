# Java Practice

A series of 15 projects, from simple console programs to a Spring Boot REST API, built to refresh and deepen my Java skills. Each project builds on the previous ones and introduces new concepts.

## Projects

| # | Project | Concepts | Status |
| --- | --- | --- | --- |
| 01 | [Number Guessing Game](01-guessing-game) | `Scanner`, `Random`, loops, input validation, methods | ✅ Done |
| 02 | Console Calculator | static methods, `switch`, `Math`, `printf` | ⏳ |
| 03 | Tic-Tac-Toe | 2D arrays, game loop | ⏳ |
| 04 | Bank Account System | classes, encapsulation, inheritance, overriding | ⏳ |
| 05 | Library Management | object relationships, `ArrayList`, `equals`/`hashCode` | ⏳ |
| 06 | Shapes and Areas | abstract classes, interfaces, polymorphism | ⏳ |
| 07 | Student Grade Manager | `HashMap`, `Set`, `Comparator`, sorting | ⏳ |
| 08 | To-Do List with File Storage | file I/O, exceptions, `enum`, `LocalDate` | ⏳ |
| 09 | Word Frequency Counter | string processing, regex, maps | ⏳ |
| 10 | Expense Tracker | records, lambdas, Stream API, `Optional`, `BigDecimal` | ⏳ |
| 11 | Modern Java Refactor | records, streams, switch expressions, `var` | ⏳ |
| 12 | Unit Tests | JUnit, Maven, parameterized tests | ⏳ |
| 13 | Weather / Currency App | `HttpClient`, JSON (Jackson/Gson), public APIs | ⏳ |
| 14 | Multithreaded Bank Simulation | threads, `ExecutorService`, locks, atomics | ⏳ |
| 15 | REST API with Spring Boot | Spring Web, JPA, validation, REST | ⏳ |

## Structure

Each project lives in its own folder:

```
PracticeJava/
├── 01-guessing-game/
│   ├── src/        # source code
│   ├── lib/        # external libraries (.jar)
│   └── README.md
├── 02-calculator/
└── ...
```

- Projects **01–11** are plain Java projects (no build tool).
- Projects **12–15** use **Maven**.

## Requirements

- Java 21 (OpenJDK)
- VS Code with the Extension Pack for Java (or any Java IDE)
- Maven (for projects 12–15)

## How to run

**Plain Java projects (01–11):** open the project folder in VS Code and press **Run** above `main`, or from the terminal:

```
cd 01-guessing-game
javac -d bin src/*.java
java -cp bin App
```

**Maven projects (12–15):**

```
cd 12-unit-tests
mvn test        # run the tests
mvn package     # build
```
