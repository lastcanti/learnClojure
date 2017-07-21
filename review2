; strings are java strings
; you can use java string methods on them

(.toUpperCase "hello world")
(.toLowerCase "HELLO WORLD")
(.length "hello world")


; lists can be constructed with either a function or quoted form
(list [1 2 "a" 4 1/3])
'(1 2 "a" 4 1/3)
(=(list [1 2 "a" 4 1/3]'(1 2 "a" 4 1/3)))


; conj will return a new list with items added to front 
(conj '(1 2 3)0)

; vectors can be made with list, vec, or vector
(= [:a :b :c]
   (list :a :b :c)
   (vec '(:a :b :c))
   (vector :a :b :c))


; conj function will return new vector with one or more 
; items added to the end
(conj [1 2 3]4)
(=[1 2 3 4](conj [1 2 3]4))
