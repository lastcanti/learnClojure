; A little introduction to namespaces and functions

; create a namespace for us to work in
; a namespace is a mapping from symbol to vars or classes

(ns theStart) 
; lets create a function with defn 
(defn hello-world [] "Hello World")
(hello-world)

; use def to create a var
(def x 1)
x

; we should use let for temporary binding
(let [x 0]x) ; this would evaluate to 0
x            ; when we call x it will return 1 still


; if we change namespaces and attempt to call hello-world
; we will not have access to it, and we will get an error after eliminating '
; we have set them to temporarily evaluate as lists

'(ns theEnd)
'(hello-world)

