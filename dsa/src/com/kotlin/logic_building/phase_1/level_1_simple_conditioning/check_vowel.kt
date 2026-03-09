package com.kotlin.logic_building.phase_1.level_1_simple_conditioning

fun main(){
    val listOfChats = listOf('a','w','b','c','d','e','f')
    for (item in listOfChats){
        checkVowel(item)
    }
}

fun checkVowel(item: Char) {
    if (item in 'a'..'z'){
        if (item in "aeiiou"){
            println("$item is a vowel")
        } else {
            println("$item is a consonant")
        }
    } else{
        println("Invalid char")
    }
}
