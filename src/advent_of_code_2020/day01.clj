(ns advent-of-code-2020.day01
  (:require [clojure.string :as s]))

(def input (map #(Integer/parseInt %)
                (s/split (slurp "input/day01") #"\n")))

(defn part1
  []
  (prn (first (for [x input
                    y input
                    :when (= 2020 (+ x y))]
                (* x y)))))

