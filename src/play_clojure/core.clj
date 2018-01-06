(ns play-clojure.core
  (:gen-class)
  (require [clojure.java.jdbc :as j])
  (require [play-clojure.databases :as db])
  (use [clojure.pprint :only [print-table]]))

(defn xyz [x y z] 
  (println (str x y z)))

;; Test select
(defn testdb []
  ((pprint (j/query db/mysql1 "show tables"))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!" (xyz 1 2 3)))
