; hash map and array maps have the same creation
; hash maps are faster look-up but do not have an order
(class{:a 1 :b 2 :c 3})
(class (hash-map :d 4 :e 5 :f 6))

; maps should use keywords for keys
(class :a)

(def keymap {:a 1, :b 2, :c 3})
keymap
(keymap :c) 

; use assoc to add new value to map
(def newkeymap (assoc keymap :d 4))


; use dissoc to remove value from map
(dissoc keymap :a :b) 
