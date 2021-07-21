# ING-katas

### Part 1
Write a program that prints the numbers 1,2,3,4,5,6,7,8,9,10
### Part 2
Write a function that calculates the area of a triangle
* Assumptions: 
  * Measurement unit is unnecessary at this point
  * Caller will handle the IllegalArgumentException as expected behavior is unknown in case of wrong input params (0)
### Part 3
The file football.dat contains the results from the English Premier League for 2001/2. The columns labeled ‘F’ and ‘A’ contain the total number of goals scored for and against each team in that season (so Arsenal scored 79 goals against opponents, and had 36 goals scored against them). Write a program to print the name of the team with the smallest difference in ‘for’ and ‘against’ goals.
* Assumption:
  * Goal difference should be an absolute value (Ignoring sign)
  * All teams should be returned if more than one team has smallest goal difference
## How to validate/run

GitHub Actions has been configured for this repo which will be triggered automatically on every commit or PR merge to main branch. </br>
Output and test cases are available in the latest run. </br>

For running locally, you can use: </br>
```sbt compile test``` and ```sbt compile run```

### Sample output from the console
**Part 1**</br>
1,2,3,4,5,6,7,8,9,10</br>
**Part 2**</br>
Area of Triangle with base 14.30 and height 4.0 is: 28.60</br>
**Part 3**</br>
Team(s) with the smallest difference in 'for' and 'against' goals:</br>
* Team: Tottenham, Goals Scored For: 49, Goals Score Against: 53</br>
* Team: Blackburn, Goals Scored For: 55, Goals Score Against: 51</br>