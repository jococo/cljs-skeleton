(ns {{name}}.main-templates
 (:use
  hiccup.core
  hiccup.page))

(defn- lorem [n]
 "Send back some lorem ipsum text."
 "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")

(defn main-layout [& body]
 (html5
  [:head
    [:title "Started!"]
    (include-css "css/bootstrap.css" "/css/app.css" "css/bootstrap-responsive.css")]
  (into [:body] (conj (vec body) (include-js "js/main.js")))))

(defn nav-bar []
 [:div.navbar.navbar-fixed-top
  [:div.navbar-inner
    [:div.container
      [:button.btn.btn-navbar {:type "button" :data-toggle "collapse" :data-target ".nav-collapse"}
        [:span.icon-bar]
        [:span.icon-bar]
        [:span.icon-bar]]
      [:a.brand.show_home_link {:href "#"} "Play 2"]
      [:div.nav-collapse.collapse
        [:ul.nav
          [:li [:a.show_about_link {:href "#"} "About" ]]
          [:li [:a {:href "#"} "Link Two" ]]
          [:li [:a.show_contact_link {:href "#"} "Contact" ]]]]]]])

(defn index []
 (main-layout
  (nav-bar)
  [:div.container.main-page
    [:div.row
      [:div.span12
        [:h1 "Hello Again"]
        [:div#content]]]]))
