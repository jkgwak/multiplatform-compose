package com.rouge41.kmm.compose

actual data class PaddingValues actual constructor(actual val start: Dp, actual val top: Dp, actual val end: Dp, actual val bottom: Dp) {
    actual constructor(all: Dp) : this(all, all, all, all)
}