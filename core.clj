(ns holon.core)

(defn borg [] '(borg))

(def current-borg (atom (first (get-borgs))))

(defn get-borgs []
  '(steve
    chiron
    cyber-ranger
    onix-nexus))

(defn next [] ())
