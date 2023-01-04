package advent2022

import advent2022.day.Day
import advent2022.day.Day1
import advent2022.day.Day2
import advent2022.day.Day3

fun main() {
    println("Advent of Code 2022")
    val days: List<Day> = listOf(Day1, Day2, Day3)

    days.forEach{ it.run() }
}