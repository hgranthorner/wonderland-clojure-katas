(ns alphabet-cipher.coder)

(def smallest (- (int \a) 1))
(def largest  (int \z))

(defn add-chars [a b]
  "Add the numeric values of two chars return the new char."
  (let [char-sum (- (+ (int a) (int b)) smallest)]
    (if (> char-sum largest)
      (char (- char-sum 26))
      (char char-sum))))

(defn repeat-first [first second]
  "Repeat first string until it is at least as long as the second."
  (let [x (+ 1 (int (/ (count second) (count first))))]
    (clojure.string/join (repeat x first))))


;; We need to duplicate the keyword so that it's at least as long as the message
;; (map vector (clojure.string/join (repeat x-times keyword)) message)
;; This will get us a list of pairs of (message letter, keyword letter)
;; Then we just need to add the letters together to get the new letter

(defn encode [keyword message]
  "encodeme")

(defn decode [keyword message]
  "decodeme")

(defn decipher [cipher message]
  "decypherme")
