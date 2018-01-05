(defproject play-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [org.clojure/java.jdbc "0.7.5"]
    [mysql/mysql-connector-java "5.1.44"]
  ]
  :main ^:skip-aot play-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
