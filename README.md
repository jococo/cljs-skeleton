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

The you need to tell Leiningen about the new template.
In your `~/.lein/` folder (in your home directory) open `profiles.clj`. If there are no plugins
then you need to enter:

    {:user
        {:plugins [[cljs-skeleton/lein-template "0.1.0-SNAPSHOT"]]}}

Alternatively, it may be that you already have leiningen plugins. In which case you solely need to add:

    [cljs-skeleton/lein-template "0.1.0-SNAPSHOT"]

Into the plugins vector.

## Usage

Replacing 'new-project-name' with the name you choose for your new project:

    lein new cljs-skeleton new-project-name

This command will create a new folder with all the project files specified by the template inside it.

## Run

CD into the new project.

To fire up the web server, type the following in a terminal from within your project:

    lein ring server

Leave that running and then open another terminal and CD to you project, then type:

    lein cljsbuild auto dev

which gives automatic compilation whenever you make any changes in your ClojureScript files.

## Repl

This section on setting up a Repl that connects with the running code in your browser comes from the excellent set of ClojureScript tutorials [modern-cljs](https://github.com/magomimmo/modern-cljs/blob/master/doc/tutorial-02.md)

Open another terminal window in the root of the project. Type:

    ./cljs-repl listen

If you get the message `permission denied` then cljs-repl is not executable so type:

    chmod +x cljs-repl

When you get the message 'listening on port 9000' refresh your browser, then, in the terminal, you should see the ClojureScript repl command prompt. Now type:

    (js/alert "Hi there")

and you should be rewarded with an Alert box appearing in your browser window.

## License

Copyright © 2013 Joc O'Connor

Distributed under the Eclipse Public License, the same as Clojure.
