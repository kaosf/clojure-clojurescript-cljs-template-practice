# clojurescript-practice

A website written with Noir and ClojureScript.

## Usage

```bash
lein deps
lein run
```

Open `localhost:8090`.

Remove comment out at line 13 in `src/clojurescript-practice/client/main.cljs` and run;

```sh
lein repl
```

```clj
(require 'cljs.repl)
(require 'cljs.repl.browser)
(cljs.repl/repl (cljs.repl.browser/repl-env))

(js/alert "message")
```

... REPL dies.

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2014 ka
