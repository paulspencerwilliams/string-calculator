(ns string-calculator.core-test
  (:require [string-calculator.core :refer :all])
  (:use expectations))


;; empty string should result in 0
(expect 0 (calculate ""))

;; single character numeric string should result in itself
(expect 1 (calculate "1"))

;; another single character numeric string should result in itself
(expect 2 (calculate "2"))

;; two comma seperated string numerics should result in addition
(expect 3(calculate "1,2"))

;; two newline seperated string numerics should result in addition
(expect 3(calculate "1\n2"))
(expect 3(calculate "1\n2\n"))

;; custome delimiter should result in addition
(expect 3(calculate "//;\n1;2"))

;; negative numbers should result in exception
(expect Exception (calculate "-1,2"))

;; numbers greater than 1000 should be ignored
(expect 1001(calculate "1,1000"))
(expect 1(calculate "1,1001"))

