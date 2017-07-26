;A terse introduction for an intermediate programmer
;For familiarization with Clojure for effective usage.
;Datatypes, Lists, rests


(ns simpleData)
; Simple dataTypes include nil which 
; Symbolizes nothing, integers, ratios,
; (without decimals), values that begin with colons,
; \j, and boolean values true and false


1
1/3
:arbitrary
\j
true
false

; Expressions are lists of things. (+ 1 1) evaluates
; To the value 2. Operations precede arguments
; Creating a list '()
; Lists, maps, vectors and sets are different 
; Collections used depending upon how you would 
; Like to access data and structure it

; list of simple datatypes
'(1 1/3 :arbitrary \j true)

; Functions must be used to evaluate Lists
(first '(1 1/3 :arbitrary \j true))

; Function rest() returns list minus first value
(rest '( 1 1/3 :arbitrary \j true))

; Function nested first-rest
(first (rest '(1 1/3 :arbitrary \j true)))
