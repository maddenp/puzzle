(defproject puzzle "0.1.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [loco "0.3.1"]]
  :main ^:skip-aot puzzle.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
