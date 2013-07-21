(ns leiningen.new.cljs-skeleton
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "cljs-skeleton"))

(defn cljs-skeleton
  "Create a new ClojureScript and Compojure project."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             [".gitignore"                                          (render "gitignore" data)]
             ["cljs-repl"                                           (render "cljs-repl" data)]
             ["project.clj"                                         (render "project.clj" data)]
             ["README.md"                                           (render "README.md" data)]
             ["src/clj/{{sanitized}}/handler.clj"                   (render "handler.clj" data)]
             ["src/clj/{{sanitized}}/main_templates.clj"            (render "main_templates.clj" data)]
             ["src/cljs/{{sanitized}}/main.cljs"                    (render "main.cljs" data)]
             ["src/cljs-util/connect/connect.cljs"                  (render "connect.cljs" data)]
             ["runners/phantomsjs.js"                               (render "phantomjs.js" data)]
             ["resources/public/css/bootstrap.css"                  (render "bootstrap.css" data)]
             ["resources/public/css/app.css"                        (render "app.css" data)]
             ["resources/public/css/bootstrap-responsive.css"       (render "bootstrap-responsive.css" data)]
             ["resources/public/js/jquery.js"                       (render "jquery.js" data)]
             ["resources/public/js/bootstrap.js"                    (render "bootstrap.js" data)]
             "resources/public/css"
             "resources/public/img"
             "resources/public/js")))
