package com.example.day2_kotlin_basics

data class CoffeeDetails(
    val name: String,
    val coffeeCount: Int,
    val milkCount: Int,
    val sugarCount: Int
)

fun main(){
    val coffeeForMateus = askInfo()
    makeCoffee(coffeeForMateus)
}

fun askInfo(): CoffeeDetails {
    println("Name: ")
    val name = readln().toString()
    println("Coffee amount: ")
    val coffeeAmount = readln().toInt()
    println("Milk amount: ")
    val milkAmount = readln().toInt()
    println("Sugar amount: ")
    val sugarAmount = readln().toInt()

    return CoffeeDetails(name, coffeeAmount, milkAmount, sugarAmount)
}

fun makeCoffee(materials: CoffeeDetails){
    if (materials.sugarCount == 1){
        println("Here is your coffee with ${materials.coffeeCount} mg of coffee, with ${materials.milkCount} ml of milk and ${materials.sugarCount} spoon of sugar for ${materials.name}")
    }
    else {
        println("Here is your coffee with ${materials.coffeeCount} mg of coffee, with ${materials.milkCount} ml of milk and ${materials.sugarCount} spoons of sugar for ${materials.name}")
    }
}