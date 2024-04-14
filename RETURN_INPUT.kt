package com.example.hero.practish

import java.util.Scanner

fun main(){
   var a= add1(input1())
    println("sum of the number=$a")

}

fun input():Int{
    print("Enter the any number=")
    var scanner= Scanner(System.`in`)
    var num1:Int=scanner.nextInt()
    return num1

}

fun input1():Int{
    print("Enter the any number=")
    var scanner= Scanner(System.`in`)
    var num2:Int=scanner.nextInt()
    return num2
}

fun add1 (c:Int):Int{
    var b=input()+c
    return b
}



