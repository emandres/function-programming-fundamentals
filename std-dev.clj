(defn sum
  [xs]
  (reduce + xs))

(defn mean
  [xs]
  (let [n (count xs)]
    (/ (sum xs) n)))

(defn square
  [x]
  (* x x))

(defn std-dev
  [& xs]
  (let [x-bar (mean xs)
        n (count xs)]
    (Math/sqrt
      (/ (sum (map (fn [x]
                     (square (- x x-bar)))
                   xs))
         n))))

;(println (mean [2 4 4 4 5 5 7 9]))
(println (std-dev 2 4 4 4 5 5 7 9))

