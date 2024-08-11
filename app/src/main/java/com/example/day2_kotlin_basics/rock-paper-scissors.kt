package com.example.day2_kotlin_basics

fun main(){
    println("Rock, paper or scissors?")
    var userChoice = readln().lowercase()
    val randomNumber = (1..3).random()
    var computerChoice = ""
    val options = listOf("rock", "paper", "scissors")

    when (randomNumber) {
        1 -> {
            computerChoice = "rock"
        }

        2 -> {
            computerChoice = "paper"
        }

        3 -> {
            computerChoice = "scissors"
        }
    }

        val winner = when {
            userChoice == computerChoice -> "tie"
            userChoice == "rock" && computerChoice == "scissors" -> "player"
            userChoice == "paper" && computerChoice == "rock" -> "player"
            userChoice == "scissors" && computerChoice == "paper" -> "player"
            else -> "computer"
            }

    while (userChoice !in options){
        println("Rock, paper or scissors?")
        userChoice = readln().lowercase()
    }

    println("The computer chose $computerChoice")
    if (winner == "tie") {
        println("It's a tie!")
    }
    else {
        println("The $winner won!")
    }
}
