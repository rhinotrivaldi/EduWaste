package com.rhinotrivaldi.eduwaste

data class Limbah(
    var name: String ?= "",
    var detail: String ?= "",
    var photo: Int = 0,
    var advancedManagement: String ?= "",
    var hazardCode: String ?= ""
)