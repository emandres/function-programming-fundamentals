(ns recursion-2)

(defn factorial
  ([n]
   (factorial n ""))
  ([n tab]
   (do
     (println tab n)
     (read-line)
     (if (> n 1)
       (let [m (factorial (dec n) (str tab " "))]
         (println tab (str n " * " m " = " (* n m)))
         (read-line)
         (* n m))
       1))))

;(let [n (read-string (second *command-line-args*))]
  ;(factorial n ""))
