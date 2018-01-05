(ns play-clojure.core
  (:gen-class))

(require '[clojure.java.jdbc :as j])

(defn xyz [x y z] 
  (println (str x y z)))

(def mysql-db {:dbtype "mysql"
               :dbname "awtest"
               :user "root"
               :password ""})

(j/query mysql-db
  ["select * from task"])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!" (xyz 1 2 3)))