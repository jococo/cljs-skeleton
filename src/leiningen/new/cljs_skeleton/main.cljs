(ns {{name}}.main
 (:use-macros
  [dommy.macros :only [sel sel1]])
 (:require
   [dommy.utils :as utils]
   [dommy.core :as dommy]))


(js/alert "Working!")