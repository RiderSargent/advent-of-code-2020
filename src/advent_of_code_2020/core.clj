(ns advent-of-code-2020.core
  (:require [advent-of-code-2020.day01 :as day01]
            [advent-of-code-2020.day02 :as day02]))

(defn -main
  [& args]
  (println "Day 1, part 1: " (day01/part1))
  (println "Day 1, part 2: " (day01/part2))
  (println "Day 2, part 1: " (day02/part1)))

