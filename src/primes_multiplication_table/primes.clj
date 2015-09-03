(ns primes-multiplication-table.primes
  (:gen-class))

(defn is-prime?
  "Test if prime by finding if the set of numbers which divide into n is empty.
  This can be sped up by exiting when a number if found that divides in (non-prime)"
  [n]
  (empty? (filter #(= 0 (mod n %)) (range 2 n))))

(def prime-numbers
  "Return a lazy sequence of prime number.
  
  Filter the sequence of numbers starting at 3 incremented by 2.
  This keeps us from looking at multiples of 2
  Prepend 2 because we know it is prime"
  (cons 2 (filter is-prime? (iterate #(+ 2 %) 3))))

(defn get-prime-numbers
  "Wrapper function for using the prime-numbers sequence"
  [num]
  (take num prime-numbers))

