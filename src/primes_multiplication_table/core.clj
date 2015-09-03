(ns primes-multiplication-table.core
  (:gen-class)
  (:use [primes-multiplication-table.primes :as primes])  
  (:require [clojure.string :refer [join]]))

(defn get-primes
  "Return N primes"
  [num]
  (primes/get-prime-numbers num))

(defn build-multiplication-table
  "Return a vector of vectors created by multiplying each value in nums
  @see http://stackoverflow.com/a/3330867"
  [nums]
  (vec (map (fn [x] (vec (map (fn [y] (* x y)) nums))) nums)))
  
(defn number-string-width
  "Return the number of characters needed to print a number. The string width of a number"
  [n]
  (count (str n)))

(defn largest-number-width
  "Return the width of the widest number in a list"
  [nums]
  (apply max (map number-string-width nums)))

(defn header
  "Print the column headers and dividing line"
  [fmt primes]
  (apply format fmt "" primes))

(defn divider
  "Return the header body divider.
  -|--|--|--|--|--|-"
  [widths]
  (join "-|-" (map #(String. (char-array % \-)) widths)))
  
(defn print-primes-table
  "Build the table and then print it in a formatted table"
  [n]
  (let [primes (get-primes n)
        table (build-multiplication-table primes)
        widths (cons (largest-number-width primes)
                    (map largest-number-width (map cons primes table)))
        fmt (join " | " (map #(str "%" % "s") widths))]
    (println (header fmt primes))
    (println (divider widths))
    (doseq [row (map cons primes table)]
      (println (apply format fmt row)))))

(defn -main
  "Write to STDOUT a multiplication table of the first 10 prime
  numbers. The first row and column of the table should have the 10
  primes, with each cell containing the product of the primes for the
  corresponding row and column.

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
  "
  [& args]
  (let [n (if args (Integer/parseInt (first args)) 10)]
    (print-primes-table n)))

