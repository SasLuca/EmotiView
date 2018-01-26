package com.castingthevoid.emotiview

//Similar to Any.apply but it is infix and shorter
inline infix fun <reified T : Any> T.dot(func: T.() -> Unit) : T { func(); return this }

