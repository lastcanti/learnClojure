; assignments are known as bindings 
; all () are forms or expressions
; exmaples and code from https://kimh.github.io/clojure-by-example/#anonymous-function

(def a "andy")
a
'a
; use ' to stop clojure from evaluating variable
; all values are data
"h"
100
; when we use () we are telling clojure to evaluate the expression

; let is similiar to a private variable
(let [abc "a b c"]println abc)

; you do not want to introduce state by using def
; use defn to create function

(defn say-hello
    [name]
    (println (str "Hello, " name)))
(say-hello "Andy")

; provide meta-data with {}
; provide doc with doc
 (defn say-hello
         "Takes name argument and say hello to the name"
         {:added "1.0"
          :static true}
         [name]
         (println (str "Hello, " name)))

; use fn to create a function
(fn [] (println "Hello world"))
(def hello-world-func (fn [] (println "Hello world")))
(hello-world-func)
