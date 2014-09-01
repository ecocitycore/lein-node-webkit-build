(defproject node-webkit-build "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [clj-http "1.0.0" :exclusions [com.fasterxml.jackson.core/jackson-core]]
                 [grimradical/clj-semver "0.2.0" :exclusions [org.clojure/clojure]]
                 [commons-io "2.4"]
                 [me.raynes/fs "1.4.4"]
                 [slingshot "0.10.3"]
                 [com.taoensso/timbre "3.2.1"]]

  :profiles {:dev {:dependencies [[com.gfredericks/vcr-clj "0.4.0"]]}})
