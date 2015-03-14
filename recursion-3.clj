(ns recursion-3)
(defn count-up
  [n]
  (if (> n 1)
    (inc (count-up (dec n)))
    1))
