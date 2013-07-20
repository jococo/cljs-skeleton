# cljs-skeleton

A Leiningen template for ClojureScript development.

I put this together to allow me to set up a new ClojureScript project very quickly.
It also pulls in Bootstrap and jQuery and defines a simple layout and initial web page.
Compojure is a dependency for running a web server to test out your CLojureScript.

## Install

Make sure you have [Leiningen](https://github.com/technomancy/leiningen) installed.

    git clone https://github.com/jococo/cljs-skeleton.git
    cd cljs-skeleton
    lein install

## Usage

    lein new cljs-skeleton 'new project name'

## Run

To fire up the web server, type the following in a terminal from within your project:

    lein ring server
    
Leave that running and then open another terminal and CD to you project, then type:

    lein cljsbuild auto dev

which gives automatic compilation whenever you make any changes in your ClojureScript files.

## License

Copyright © 2013 Joc O'Connor

Distributed under the Eclipse Public License, the same as Clojure.
