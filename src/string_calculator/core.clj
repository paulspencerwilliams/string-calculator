(ns string-calculator.core)

(defn extract-numbers [the-string]
  (clojure.core/re-seq #"\d" the-string))

(defn add [the-string]
  (reduce + (map read-string (extract-numbers the-string))))

(defn calculate [the-string]
  (if (empty? the-string) 0 (add the-string)))

