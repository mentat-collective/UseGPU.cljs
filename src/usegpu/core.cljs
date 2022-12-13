(ns usegpu.core
  (:require ["@use-gpu/react" :as ur]
            ["@use-gpu/webgpu" :as uw]))

;; Aliases for testing.

(def LiveCanvas ur/LiveCanvas)
(def WebGPU uw/WebGPU)
(def AutoCanvas uw/AutoCanvas)
