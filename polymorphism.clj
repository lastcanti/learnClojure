; to create a function that behaves differently
; based on input, we would use a case statement

(defn who-are-you [input]
  (cond
    (= java.lang.String (class input)) "String - Who are you?"
    (= clojure.lang.Keyword (class input)) "Keyword - Who are you?"
    (= java.lang.Long (class input)) "Number - Who are you?"))
   
   
(who-are-you :alice)
(who-are-you "alice")
(who-are-you 123)
(who-are-you true)


; we can do this in clojure with multiple methods

; who-are-you function will have 1 argument
(defmulti who-are-you class)
; if the input is String then pass original
; value of input to a str function
(defmethod who-are-you java.lang.String [input]
           (str "String - Who are you? " input))
(defmethod who-are-you clojure.lang.Keyword[input] 
           (str "Keyword - who are you? " input))
(defmethod who-are-you java.lang.Long [input]
           (str "Number - who are you? " input))
         
; returns value of the :alice input str         
(who-are-you "alice")
(who-are-you 123)
