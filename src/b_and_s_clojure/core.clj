(ns b-and-s-clojure.core
  (:gen-class))

(defn badge-maker
  [name]
  (println ( str "Hello my name is " name ))
  )

(def speakers
  ["Edsger" "Ada" "Charles" "Alan" "Grace" "Linus" "Matz"]
  )

(defn badge-batch-creator []
  (map badge-maker speakers)
  )

(def x (atom 0))

(defn room-construct
  [name]
  (str "Hello " name "! You'll be assigned to room " (swap! x inc)))
  
(defn assign-rooms []
  (map room-construct speakers)
  )

(defn printer []
  (println (badge-maker "Dan"))
  (println (badge-batch-creator))
  (println (assign-rooms))
  )
(defn -main
  [& args]
  (printer)
  )
