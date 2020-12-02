(ns advent-of-code-2020.day02
  (:require [clojure.string :as s]))

(def input (s/split-lines (slurp "input/day02")))

(defn validate
  [line]
  (let [[low high c s] (s/split line #"-|:?\s+")
        n (if (s/includes? s c) (get (frequencies s) (.charAt c 0)) 0)]
    (and (<= (Integer/parseInt low) n)
         (<= n (Integer/parseInt high)))))

(defn part1
  []
  (count (filter validate input)))

