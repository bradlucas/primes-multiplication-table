# primes-multiplication-table

## Objective

Write a program that prints out a multiplication table of the first 10
prime numbers.  The program must run from the command line and print
one table to STDOUT.  The first row and column of the table should
have the 10 primes, with each cell containing the product of the
primes for the corresponding row and column.


## Usage

	$ lein run [num]

	With num being the number of primes to use to build the table.
	Num has a default value of 10.


## Tests
	
	$ lein test

## Example

	$ lein run 10

	   |  2 |  3 |   5 |   7 |  11 |  13 |  17 |  19 |  23 |  29
	---|----|----|-----|-----|-----|-----|-----|-----|-----|----
	 2 |  4 |  6 |  10 |  14 |  22 |  26 |  34 |  38 |  46 |  58
	 3 |  6 |  9 |  15 |  21 |  33 |  39 |  51 |  57 |  69 |  87
	 5 | 10 | 15 |  25 |  35 |  55 |  65 |  85 |  95 | 115 | 145
	 7 | 14 | 21 |  35 |  49 |  77 |  91 | 119 | 133 | 161 | 203
	11 | 22 | 33 |  55 |  77 | 121 | 143 | 187 | 209 | 253 | 319
	13 | 26 | 39 |  65 |  91 | 143 | 169 | 221 | 247 | 299 | 377
	17 | 34 | 51 |  85 | 119 | 187 | 221 | 289 | 323 | 391 | 493
	19 | 38 | 57 |  95 | 133 | 209 | 247 | 323 | 361 | 437 | 551
	23 | 46 | 69 | 115 | 161 | 253 | 299 | 391 | 437 | 529 | 667
	29 | 58 | 87 | 145 | 203 | 319 | 377 | 493 | 551 | 667 | 841
	
## License

Copyright © 2015 Brad Lucas

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
