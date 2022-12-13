(ns usegpu.clerk-ui
  (:require [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [sci.core :as sci]
            [usegpu.core]))

;; ## SCI Customization
;;
;; The usegpu.core require and the following form make it possible to use this
;; library's CLJS code in the Clerk notebooks that document the library.

(sci.ctx-store/swap-ctx!
 sci/merge-opts
 {:classes    {'Math js/Math}
  :aliases    {'gpu 'usegpu.core}
  :namespaces
  {'usegpu.core
   (sci/copy-ns usegpu.core (sci/create-ns 'usegpu.core))}})
