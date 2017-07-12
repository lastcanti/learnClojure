; A terse introduction for an intermediate programmer
; Provides familiarization with Clojure for effective usage.
; Vectors, collections, lists, and maps
(ns simpleData)

; If you need to access middle of list or use an index
; Use vectors indicated by []
[1 1/3 true nil :ajar]
(first[1 1/3 true nil :ajar])
(rest[1 1/3 true nil :ajar])

; Use Nth function to get an element
(nth [1 1/3 true nil :ajar] 3)
; Access time is quicker with vectors
(last [1 1/3 true nil :ajar])
; Return number of elements
(count [1 1/3 true nil :ajar])

; What do collections have in common: immutable and persistent
; Persistent means structures will use smart creation of new versions
; Conj will add elements to collections in smartest way:
; list=front and vector=back

; the value 0 added to beginning of list
(conj '(1 1/3 true nil :ajar) 0)

; the value 0 and 1 added to end of vector
(conj [1 1/3 true nil :ajar] 0 1)

; key-value pairs are collections called maps {}
{:bike1 "schwinn" :bike2 "mountain" :bike3 "motor"}
; return values with get
(get{:bike1 "schwinn" :bike2 "mountain" :bike3 "motor"}:bike1)
; keys and values functions return keys or values
(keys{:bike1 "schwinn" :bike2 "mountain" :bike3 "motor"})
; dissoc and merge are important functions used on maps
; dissoc will return a new map with key-value pair removed
(dissoc {:bike1 "schwinn" :bike2 "mountain" :bike3 "motor"} :bike2)
; merge will return a combination of two maps
(merge {:bike1 "schwinn" :bike2 "mountain" :bike3 "motor"}
       {:bike1 "red" :bike2 "kid" :bike4 "adult"})

