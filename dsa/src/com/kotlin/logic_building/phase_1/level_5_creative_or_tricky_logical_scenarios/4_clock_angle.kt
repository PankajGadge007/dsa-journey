package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    clockAngle(12,15)
    clockAngle(9,15)
}
fun clockAngle(h: Int, m: Int) {
    val hour = h % 12
    val hAngle = (hour * 30.0) + (m * 0.5)
    val mAngle = m * 6.0

    var angle = Math.abs(hAngle - mAngle)
    if (angle > 180) angle = 360 - angle

    println("Smaller angle: $angle degrees")
}