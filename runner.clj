(ns runner)

(load-file "./recursion-1.clj")
(load-file "./recursion-2.clj")
(load-file "./recursion-3.clj")
(load-file "./recursion-4.clj")
(load-file "./recursion-5.clj")

(defn run
  [[name n]]
   (case (keyword name)
     :factorial (recursion-1/factorial n)
     :factorial-step (recursion-2/factorial n)
     :count-up (recursion-3/count-up n)
     :count-up-tail (recursion-4/count-up n)
     :count-up-recur (recursion-5/count-up n)))

(println (run (map read-string (rest *command-line-args*))))
