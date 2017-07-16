; declare the name space you are working in, sets scope
(ns learningClojure)

(str "use class to inespect expressions") 
(class [])
(class {})
(class '())
(str "-----------------------------------")

; lets make some lists and test if they are in fact lists
(str "testing some lists for validity")
'(1 2 3)
(list? '(1 2 3))
(str"-----------------------------------")
(str "list creation, sequences, and collections: oh my! ")

'(:bottle :goblet :chalice)
(str "is this a list?")
(list? '(:bottle :goblet :chalice))
(list? (list :bottle :goblet :chalice))
(str " Lists are collections, lets test this by using 'coll?'")
(coll? '(:bottle :goblet :chalice))
(str "sequences are abstract descriptions of list data, only lists are sequences")

(str "use 'conj' to add an element to lists or vectors")
(conj '(1 2 3)1)
(conj  '(1 2 3)5)
(str "use 'concat' to add lists and vectors together")
(concat '(1 2 3 4) [5 6 7 8])
