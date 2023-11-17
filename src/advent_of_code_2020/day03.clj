(ns advent-of-code-2020.day03
  (:require [clojure.string :as s]))

(def input (s/split-lines (slurp "input/day03")))

(defn part1
  []
  (count input))

