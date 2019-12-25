build:
	clj -A:uberjar

run:
	java -cp target/clojure.jar clojure.main -m
