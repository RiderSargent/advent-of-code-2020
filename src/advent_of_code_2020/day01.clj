(ns advent-of-code-2020.day01
  (:require [clojure.string :as s]))

(def input (map #(Integer/parseInt %)
                (s/split (slurp "input/day01") #"\n")))

(defn part1
  []
  (first (for [x input
               y input
               :when (= 2020 (+ x y))]
                 (* x y))))

(defn part2
  []
  (first (for [x input
               y input
               z input
               :when (= 2020 (+ x y z))]
                 (* x y z))))

