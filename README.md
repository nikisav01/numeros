# Numeros - Fibonacci Calculator

## Task
Write a program to display the first 21 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(0)=0, F(1)=F(2)=1.
Calculate their mean and median.

## Expected Output
```
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The mean is 843.33
The median is 55
```

## How to Run

### Run the program
```bash
./gradlew run
```
or on Windows:
```bash
gradlew.bat run
```

### Run tests
```bash
./gradlew test
```

## Project Structure
- `FibonacciGenerator` - generates Fibonacci sequence
- `StatisticsCalculator` - calculates mean and median
- `NumberPrinter` - displays results
- `Numeros` - main class