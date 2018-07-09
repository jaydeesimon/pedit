(defproject pedit "0.1.0-SNAPSHOT"
  :description "pedit"
  :url "http://github.com/buth3r/pedit"
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main pedit.cli
  :profiles {:uberjar {:aot :all}})
