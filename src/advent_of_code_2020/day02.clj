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

(defn validate2
  [line]
  (let [[p1 p2 c s] (s/split line #"-|:?\s+")
        i1 (dec (Integer/parseInt p1))
        i2 (dec (Integer/parseInt p2))
        c-at-i1 (subs s i1 (inc i1))
        c-at-i2 (subs s i2 (inc i2))]
    (or (and (= c c-at-i1) (not= c c-at-i2))
        (and (= c c-at-i2) (not= c c-at-i1)))))

(defn part2
  []
  (count (filter validate2 input)))

