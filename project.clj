(defproject units "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.apache.directory.studio/org.apache.commons.collections "3.2.1"]]
  :source-paths ["src/main/clojure"]
  :profiles {:dev {:dependencies [[org.clojure/math.combinatorics "0.0.8"]
                                  [org.clojure/test.check "0.7.0"]]
                   :plugins [[codox "0.8.10"]]
                   :global-vars {*assert* true}
                   :injections [(require 'wparker.units.core)
                                (intern 'wparker.units.core '*compile-with-unit-checks* true)]}})