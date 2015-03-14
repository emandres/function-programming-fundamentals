(ns recursion-4)

(defn count-up
  ([n]
   (count-up n 0))
  ([n acc]
   (if (> n acc)
     (count-up n (inc acc))
     acc)))
