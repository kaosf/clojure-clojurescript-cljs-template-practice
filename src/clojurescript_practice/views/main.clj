(ns clojurescript-practice.views.main
  (:require [clojurescript-practice.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:div#content]))
