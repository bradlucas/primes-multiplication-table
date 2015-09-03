(ns primes-multiplication-table.core-test
  (:require [clojure.test :refer :all]
            [primes-multiplication-table.core :refer :all]))

(deftest get-primes-test
  (is (= [2 3 5 7 11 13 17 19 23 29]
         (get-primes 10)))
  (is (= 541 (nth (get-primes 100) 99))))

(deftest build-multiplication-table-test
  (is (= [[1 2] [2 4]]
         (build-multiplication-table [1 2]))))

(deftest number-string-width-test
  (is (= 3 (number-string-width 999))))

(deftest largest-number-width-test
  (is (= 4 (largest-number-width [1 22 33 4444]))))

