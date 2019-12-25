(ns advent-of-code-2019.day01
  (:require [clojure.string :as s]
            [clojure.java.io :as io]))

(defn calc-fuel [mass]
  (- (quot mass 3) 2))

(defn solve []
  (let [file-path (-> (System/getProperty "user.dir") (str "/resources/day01.input"))
        data (-> (slurp file-path) (s/split #"\n"))]
    (->> data
         (map #(Integer. %))
         (map calc-fuel)
         (reduce +))))

(defn -main []
  (prn (solve)))

