(ns clojure-problems.day1
  (:require
    [clojure.java.io :as io]))

(defn load-inp []
  (with-open [reader (io/reader "inputs/day1.txt")]
    (->> (line-seq reader)
         (mapv #(Integer/parseInt %)))))

(defn part1 []
  (let [x (load-inp)]
    (->> (mapv - x (next x))
         (filter neg?)
         (count))))


(defn -main []
  (println "Part1: "(part1)))

(-main)