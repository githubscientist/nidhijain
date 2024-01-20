Given a number N, check whether the number is a power of 2 or not.
Given a number N, check whether the number is a even number or not.
Given a number N, check whether the number is a prime number or not.
Given a number N, check whether the number is a perfect square or not.
Given a number N, check whether the number is a fibonacci number or not.
Given a number N, check whether the number is a factorial number or not.

Algorithm:

- Write the respective number series in a list
- Initialize the first number of the series to a variable
- Generate the next number in the series from the second number as long as the number < than N.
- After the loop, check if the last number in the series we generated is equal to N.
  - If yes, return True
  - If no, return False
