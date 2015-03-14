(ns recursion-1)

(defn factorial
  [n]
  (if (> n 1)
    (* n (factorial (dec n)))
    1))

;(let [n (read-string (second *command-line-args*))]
  ;(println (factorial n)))
