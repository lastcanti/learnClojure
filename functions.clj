; currying allows creating functions with multiple arguments
; and turns it into a single arguments

(defn grow[name direction]
  (if (= direction :small)
      (str name " is growing smaller")
      (str name " is growing bigger")))
    
(grow "andy" :big)

((partial grow "andy"):small)

; to combine functions use comp 
(defn toggle-grow [direction]
  (if (= direction :small) :big :small))
(toggle-grow :big)
(toggle-grow :small)

(defn oh-my [direction]
  (str "Oh My! You are growing " direction))
(oh-my(toggle-grow :big))

; or we could use comp 
(defn surprise [direction]
  ((comp oh-my toggle-grow) direction))
(surprise :big)

; small example of using partial
(defn adder[x y]
  (+ x y))
(adder 3 4)

(def adder-5(partial adder 5))
(adder-5 10)
