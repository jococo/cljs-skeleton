(ns {{name}}.handler
  (:use compojure.core
   [ring.middleware file file-info stacktrace reload])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [{{name}}.main-templates :as tmpl]))

(defroutes app-routes
  ; (GET "/" [] (resp/resource-response "index.html" {:root "public"}))
  (GET "/" [] (tmpl/index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site
   (-> app-routes
    (wrap-reload '({{name}}))
    (wrap-file "resources/public")
    (wrap-file-info)
    (wrap-stacktrace))))
