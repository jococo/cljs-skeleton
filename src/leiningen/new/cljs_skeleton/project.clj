(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: Write something."
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 [jayq "2.4.0"]]
  :plugins [[lein-ring "0.8.5"]
            [lein-cljsbuild "0.3.2"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj/"]
  :ring { :handler {{name}}.handler/app }
  :profiles {
    :dev {
      :dependencies [[ring-mock "0.1.5"]]
    }
  }
  :cljsbuild {
    :builds {
      :dev {
        :source-paths [ "src/cljs-util/connect" "src/cljs"]
        :compiler {
          :output-to "resources/public/js/main.js"}
        }
        :prod {
          :source-paths ["src/cljs"]
          :compiler {
            :output-to "output/main.min.js"
            :optimizations :advanced
            :pretty-print false
          }
        }
        :test {
          :source-paths ["src/cljs" "test"]
          :compiler {
            :output-to "target/cljs/testable.js"
            :optimizations :whitespace
            :pretty-print true
          }
        }
      }
    :test-commands {
      "unit-tests" ["runners/phantomjs.js" "target/cljs/testable.js"]
    }
  }
)
