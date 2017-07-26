; java interop

(. "hello world" toUpperCase)
(. "HELLO WORLD" toLowerCase)

(.indexOf "hello world" "wor")

; to create instances of classes use . after class name
(String. "Hi")

; mainly used for generating UUIDs
(import 'java.util.UUID)
(UUID/randomUUID)
