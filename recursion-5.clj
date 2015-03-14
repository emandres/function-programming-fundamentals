(ns recursion-5)

(defn count-up
  ([n]
   (count-up n 0))
  ([n acc]
   (if (> n acc)
     (recur n (inc acc))
     acc)))
