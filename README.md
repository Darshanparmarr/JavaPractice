# JavaPractice

A collection of small Java exercises and practice projects, organized by topic.

## Structure

Every topic lives directly under `src/`, one folder per topic, and every class
now has a `package` declaration matching its folder path (so everything can be
compiled/run together with no name clashes, even though several folders each
have their own `Main.java`).

```
src/
├── classesJavaBasics/       # syntax basics: loops, methods, switch/if-else, calculator
├── classesJavaOpps/         # OOP concepts
│   ├── encapsulation/
│   ├── inheritance/
│   │   ├── hierarchical/
│   │   ├── multiLevel/
│   │   └── singleLevel/
│   └── polymorphism/
├── classesOperators/        # operator practice (assignment, etc.)
├── classesPatterns/         # pattern-printing exercises
├── classesPatternTwo/       # more pattern-printing exercises
├── classesVariables/        # variables practice
├── practiceChallengeOne/    # sum challenge
├── practiceFirst/           # first practice exercise
├── projectBillGenerator/    # pizza billing mini-project
├── projectCarRental/        # car rental mini-project
└── projectUPIApp/           # UPI payments mini-project
    └── UserInput/
```

## Running an example

Each folder is an independent set of classes under its own package. To compile
and run everything:

```bash
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out classesJavaBasics.Main
```

Swap `classesJavaBasics.Main` for any other package/class, e.g.
`projectBillGenerator.Main` or `projectUPIApp.Main`.

## Notes on this reorganization

- Every topic folder is now flat and consistent — no more inconsistent nested
  `.../src/` subfolders in some topics but not others.
- Every class has an explicit `package` declaration matching its folder, so
  there are no compilation collisions between the many `Main.java` files.
- IDE metadata (`.idea/`) and compiled build output (`out/`) are no longer
  tracked — see `.gitignore`.
- The old `practiceFirstExercise` folder only contained a stray IntelliJ
  `workspace.xml` (no actual source code), so it was dropped.
